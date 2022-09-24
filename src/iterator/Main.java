package iterator;


import iterator.Interface.Iterator;
import iterator.realization.Book;
import iterator.realization.BookShelf;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBooks(new Book("Around the World in 80 Days"),new Book("Bible"),new Book("Cinderella"),new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
