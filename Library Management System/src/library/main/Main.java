package library.main;

import java.util.Scanner;
import library.model.Book;
import library.model.Student;
import library.model.Admin;
import library.service.LibraryService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();

        Admin admin = new Admin(1, "Admin");
        Student student = new Student(101, "Student");

        int choice;

        do {
            System.out.println("\n----- LIBRARY MENU -----");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);
                    libraryService.addBook(book);
                    break;

                case 2:
                    libraryService.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    libraryService.issueBook(issueId, student);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    libraryService.returnBook(returnId);
                    break;

                case 5:
                    System.out.println("Exiting Library System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
