import products.Products;
import products.ProductsDao;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
//            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}