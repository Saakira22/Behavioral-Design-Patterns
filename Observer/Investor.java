class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("Notification to " + name + ": Stock price updated to " + stockPrice);
    }
}

