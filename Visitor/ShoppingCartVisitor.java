interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
    void visit(Grocery grocery);
}
