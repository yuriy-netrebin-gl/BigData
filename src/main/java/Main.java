import com.opencsv.bean.CsvToBeanBuilder;
import csvBeans.SummerDataSetBean;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        final FileReader reader = new FileReader(ClassLoader.getSystemResource("test-task_dataset_summer_products.csv").getFile());
        final var beanList = new CsvToBeanBuilder<SummerDataSetBean>(reader).withType(SummerDataSetBean.class).build().parse();

        System.out.println("Average price of product:");
        beanList.stream().filter(t -> t.getRating_five_count() != null)
                .collect(Collectors.groupingBy(SummerDataSetBean::getOrigin_country,
                        TreeMap::new,
                        Collectors.averagingDouble(SummerDataSetBean::getRating_five_count)))
                .forEach((country, averagePrice) -> System.out.println(country + " : " + averagePrice));

        System.out.println("Share of five star products: ");
        beanList.stream().filter(e -> e.getRating_five_count() != null && e.getRating_count() != null && e.origin_country != null)
                .collect(Collectors.groupingBy(SummerDataSetBean::getOrigin_country,
                        TreeMap::new,
                        Collectors.teeing(Collectors.summingLong(SummerDataSetBean::getRating_five_count),
                                Collectors.summingLong(SummerDataSetBean::getRating_count),
                                (a, b) -> 100 * a.doubleValue() / b)))
                .forEach((country, fiveStarProducts) -> System.out.println(country + " : " + fiveStarProducts));
    }
}
