public class VisitorPattern {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Electronics(100, "Laptop"),
                new Grocery(10, "Banana")
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for (ItemElement item : items) {
            item.accept(visitor);
        }
    }
}
