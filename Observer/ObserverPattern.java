public class ObserverPattern {
    public static void main(String[] args) {
        Stock googleStock = new Stock("Google", 1500.00);

        Observer investor1 = new Investor("AAA");
        Observer investor2 = new Investor("BBB");

        googleStock.registerObserver(investor1);
        googleStock.registerObserver(investor2);

        googleStock.setStockPrice(1520.00);
        googleStock.setStockPrice(1550.00);

        googleStock.removeObserver(investor1);

        googleStock.setStockPrice(1600.00);
    }
}

