public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("StocksNow");
        Observer web = new WebApp("TradePortal");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice("TCS", 3450.50);
        stockMarket.setStockPrice("INFY", 1499.00);

        // Remove one observer
        stockMarket.removeObserver(web);

        stockMarket.setStockPrice("WIPRO", 450.75);
    }
}
