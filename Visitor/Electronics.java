class Electronics implements ItemElement {
    private int price;
    private String model;

    public Electronics(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
