import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }

    public void setStockPrice(String stockName, double newPrice) {
        this.stockName = stockName;
        this.stockPrice = newPrice;
        System.out.println("\nStockMarket: Updating price of " + stockName + " to ₹" + newPrice);
        notifyObservers();
    }
}
