class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public void visit(Book book) {
        int tax = (int) (book.getPrice() * 0.10); // 10% tax
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + (book.getPrice() + tax));
    }

    @Override
    public void visit(Electronics electronics) {
        int tax = (int) (electronics.getPrice() * 0.20); // 20% tax
        System.out.println("Electronics Model::" + electronics.getModel() + " cost =" + (electronics.getPrice() + tax));
    }

    @Override
    public void visit(Grocery grocery) {
        int tax = (int) (grocery.getPrice() * 0.05); // 5% tax
        System.out.println("Grocery Item::" + grocery.getName() + " cost =" + (grocery.getPrice() + tax));
    }
}
