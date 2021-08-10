package csvBeans;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SummerDataSetBean extends CsvBean {
    @CsvBindByName()
    public String title;
    @CsvBindByName()
    public String title_orig;
    @CsvBindByName()
    public double price;
    @CsvBindByName()
    public int retail_price;
    @CsvBindByName()
    public String currency_buyer;
    @CsvBindByName()
    public int units_sold;
    @CsvBindByName()
    public int uses_ad_boosts;
    @CsvBindByName()
    public double rating;
    @CsvBindByName()
    public Long rating_count;
    @CsvBindByName()
    public Long rating_five_count;
    @CsvBindByName()
    public int rating_four_count;
    @CsvBindByName()
    public Object rating_three_count;
    @CsvBindByName()
    public Object rating_two_count;
    @CsvBindByName()
    public Object rating_one_count;
    @CsvBindByName()
    public int badges_count;
    @CsvBindByName()
    public int badge_local_product;
    @CsvBindByName()
    public int badge_product_quality;
    @CsvBindByName()
    public int badge_fast_shipping;
    @CsvBindByName()
    public String tags;
    @CsvBindByName()
    public String product_color;
    @CsvBindByName()
    public Object product_variation_size_id;
    @CsvBindByName()
    public int product_variation_inventory;
    @CsvBindByName()
    public String shipping_option_name;
    @CsvBindByName()
    public int shipping_option_price;
    @CsvBindByName()
    public int shipping_is_express;
    @CsvBindByName()
    public int countries_shipped_to;
    @CsvBindByName()
    public int inventory_total;
    @CsvBindByName()
    public Object has_urgency_banner;
    @CsvBindByName()
    public String urgency_text;
    @CsvBindByName()
    public String origin_country;
    @CsvBindByName()
    public String merchant_title;
    @CsvBindByName()
    public String merchant_name;
    @CsvBindByName()
    public String merchant_info_subtitle;
    @CsvBindByName()
    public int merchant_rating_count;
    @CsvBindByName()
    public double merchant_rating;
    @CsvBindByName()
    public String merchant_id;
    @CsvBindByName()
    public int merchant_has_profile_picture;
    @CsvBindByName()
    public String merchant_profile_picture;
    @CsvBindByName()
    public String product_url;
    @CsvBindByName()
    public String product_picture;
    @CsvBindByName()
    public String product_id;
    @CsvBindByName()
    public String theme;
    @CsvBindByName()
    public String crawl_month;

}
