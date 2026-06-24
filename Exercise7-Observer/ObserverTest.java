public class ObserverTest {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile =
                new MobileApp("Indu");

        Observer web =
                new WebApp("Admin");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice("TCS", 4200);
    }
}