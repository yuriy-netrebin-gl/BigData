import com.opencsv.bean.CsvToBeanBuilder;
import csvBeans.SummerDataSetBean;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.OptionalDouble;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        final FileReader reader = new FileReader(ClassLoader.getSystemResource("test-task_dataset_summer_products.csv").getFile());
        final var beanList = new CsvToBeanBuilder<SummerDataSetBean>(reader).withType(SummerDataSetBean.class).build().parse();
        beanList.stream().mapToDouble(SummerDataSetBean::getPrice).average().ifPresent(e -> System.out.println("Average price of product: " + e));
        final long fiveStarSum = beanList.stream().filter(t -> t.getRating_five_count() != null).mapToLong(SummerDataSetBean::getRating_five_count).sum();
        final long ratingCountSum = beanList.stream().filter(t -> t.getRating_count() != null).mapToLong(SummerDataSetBean::getRating_count).sum();
        OptionalDouble.of(100 * (double) fiveStarSum / ratingCountSum).ifPresent(value -> System.out.println("Share of five star products: " + value));
    }
}
