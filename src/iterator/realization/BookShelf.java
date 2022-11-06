package iterator.realization;

import iterator.Interface.*;


public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public void appendBooks(Book... book) {
        for (Book s : book) {
            appendBook(s);
        }
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
