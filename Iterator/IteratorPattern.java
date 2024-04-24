public class IteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Java Programming", "John Doe"));
        bookCollection.addBook(new Book("Design Patterns", "Jane Smith"));
        bookCollection.addBook(new Book("Clean Code", "Robert Martin"));

        Iterator iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

