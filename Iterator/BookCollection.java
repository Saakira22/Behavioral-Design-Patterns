import java.util.ArrayList;
import java.util.List;

class BookCollection implements LibraryCollection {
    private List<Book> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Object next() {
            return books.get(currentIndex++);
        }
    }
}


