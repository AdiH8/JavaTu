package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void displayAvailableBooks() {
        for (Book x : books) {
            x.displayBookInfo();
        }
    }

    public void addBook(Book book) {
        for (Book x : books) {
            if (x.getTitle().equals(book.getTitle())) {
                x.setCopies(x.getCopies() + book.getCopies());
                return;
            }
        }
        books.add(book);
    }

    public void borrowBook(int id){
        for (Book x: books){
            if (id == x.getId()){
                x.setCopies(x.getCopies()-1);
            }
        }
    }

    public void returnBook(int id){
        for (Book x: books){
            if (id == x.getId()){
                x.setCopies(x.getCopies()+1);
            }
        }
    }

}

