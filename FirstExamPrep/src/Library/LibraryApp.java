package Library;

import Bank.BankAccount;
import Bank.SavingsAccount;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Hacking", "Adi",5);
        book1.setTitle("Intro to Hacking");
        Book book2 = new Book(2,"Economy","Alexandra",5);
        Book book3 = new Book(3,"Intro to Hacking", "Adi",5);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(1);
        library.displayAvailableBooks();
    }
}
