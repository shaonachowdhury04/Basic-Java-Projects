package library.service;

import library.model.Book;
import library.model.Student;
import java.util.ArrayList;

public class LibraryService {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("New Book Is Successfully Added");
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void issueBook(int bookId, Student student) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isIssued()) {
                    System.out.println("Book is already issued.");
                    return;
                }
                book.setIssued(true);
                System.out.println("Book issued to " + student.getName());
                return;
            }
            System.out.println("Book not found.");
        }

    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {

                book.setIssued(false);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");

    }

}