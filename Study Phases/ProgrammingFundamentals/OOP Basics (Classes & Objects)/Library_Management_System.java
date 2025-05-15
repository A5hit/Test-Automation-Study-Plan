/*
Create a Library Management System that allows users to:
1️⃣ Add a book (title, author, year)
2️⃣ View all books in the library
3️⃣ Borrow a book
4️⃣ Return a book

✅ Classes to Implement:

Book (Attributes: title, author, year, availability)

Library (Manages the collection of books)

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Library_Management_System {
    public static void main(String[] args) {

        Library library = new Library();
        while (true) {
            System.out.println("Welcome to the Library System!");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter author: ");
                    String author = sc.nextLine();
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    library.addBook(title, author, year);
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter title: ");
                    title = sc.nextLine();
                    library.borrowBook(title);
                    break;

                case 4:
                    System.out.print("Enter title: ");
                    title = sc.nextLine();
                    library.returnBook(title);
                    break;

                case 5:
                    System.out.print("Thank you for using Library System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}

class Book {
    String title;
    String author;
    int year;
    Boolean isAvailable;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (getIsAvailable()) {
            isAvailable = false;
            System.out.println("Book is borrowed successfully");
        } else {
            System.out.println("Book is not available to borrow");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book is returned successfully");
        } else {
            System.out.println("This book was not borrowed");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nisAvailable: " + getIsAvailable());
    }


}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
        System.out.println("Book added!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found");
    }


}