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
        boolean found = false;
        for (Book x: books){
            if (id == x.getId()){
                x.setCopies(x.getCopies()-1);
                found = true;
            }
        }
        if (found){
            System.out.println("The book is borrowed !");
        }
        else{
            throw new RuntimeException("There is no book with that ID !");
        }
    }

    public void returnBook(int id){
        boolean found = false;
        for (Book x: books){
            if (id == x.getId()){
                x.setCopies(x.getCopies()+1);
                found = true;
            }
        }
        if (found){
            System.out.println("The book is returned !");
        }
        else{
            throw new RuntimeException("There is no book with that ID !");
        }
    }

}

