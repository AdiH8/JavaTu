package Library;

import Bank.BankAccount;
import Bank.SavingsAccount;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1,"The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book book2 = new Book(2,"To Kill a Mockingbird", "Harper Lee", 3);
        Book book3 = new Book(3,"1984", "George Orwell", 8);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Available Books:");
        library.displayAvailableBooks();
        System.out.println();

        library.borrowBook(1);
        library.borrowBook(3);

        library.returnBook(3);

        library.returnBook(1);

        System.out.println("\nUpdated Available Books:");
        library.displayAvailableBooks();
    }
}
