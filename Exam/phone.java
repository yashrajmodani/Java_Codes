//package Exam;
//
//public class phone {
////    ---------------------------------
////    Book.java
////-----------------------------------------------------
//
//    class Book {
//        private String title;
//        private String author;
//        private int publicationYear;
//        private String isbn;
//        private boolean borrowed;
//
//        public Book(String title, String author, int publicationYear, String isbn) {
//            this.title = title;
//            this.author = author;
//            this.publicationYear = publicationYear;
//            this.isbn = isbn;
//            this.borrowed = false; // Book is initially not borrowed
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getAuthor() {
//            return author;
//        }
//
//        public String getIsbn() {
//            return isbn;
//        }
//
//        public boolean isBorrowed() {
//            return borrowed;
//        }
//
//        public void borrow() {
//            this.borrowed = true;
//        }
//
//        public void returnBook() {
//            this.borrowed = false;
//        }
//
//        @Override
//        public String toString() {
//            return "Title: " + title + ", Author: " + author + ", Year: " + publicationYear +
//                    ", ISBN: " + isbn + ", Borrowed: " + (borrowed ? "Yes" : "No");
//        }
//    }
////
////======================================================================================
////
////    LibraryManagementSystem.java
////
////import java.util.ArrayList;
////import java.util.Scanner;
//
//
//    public class LibraryManagementSystem {
//        private ArrayList<Book> books;
//        private Scanner scanner;
//
//        public LibraryManagementSystem() {
//            books = new ArrayList<>();
//            scanner = new Scanner(System.in);
//        }
//
//        public void addBook() {
//            System.out.print("Enter book title: ");
//            String title = scanner.nextLine();
//            System.out.print("Enter book author: ");
//            String author = scanner.nextLine();
//            System.out.print("Enter publication year: ");
//            int year = Integer.parseInt(scanner.nextLine());
//            System.out.print("Enter ISBN: ");
//            String isbn = scanner.nextLine();
//
//            books.add(new Book(title, author, year, isbn));
//            System.out.println("Book added successfully!");
//        }
//
//        public void displayBooks() {
//            if (books.isEmpty()) {
//                System.out.println("No books available in the library.");
//                return;
//            }
//            System.out.println("Library Books:");
//            for (Book book : books) {
//                System.out.println(book);
//            }
//        }
//
//        public void searchByTitle() {
//            System.out.print("Enter book title to search: ");
//            String title = scanner.nextLine();
//            boolean found = false;
//
//            for (Book book : books) {
//                if (book.getTitle().equalsIgnoreCase(title)) {
//                    System.out.println(book);
//                    found = true;
//                }
//            }
//            if (!found) {
//                System.out.println("No book found with that title.");
//            }
//        }
//
//        public void searchByAuthor() {
//            System.out.print("Enter author name to search: ");
//            String author = scanner.nextLine();
//            boolean found = false;
//
//            for (Book book : books) {
//                if (book.getAuthor().equalsIgnoreCase(author)) {
//                    System.out.println(book);
//                    found = true;
//                }
//            }
//            if (!found) {
//                System.out.println("No book found by that author.");
//            }
//        }
//
//        public void borrowBook() {
//            System.out.print("Enter ISBN of the book to borrow: ");
//            String isbn = scanner.nextLine();
//            boolean found = false;
//
//            for (Book book : books) {
//                if (book.getIsbn().equals(isbn)) {
//                    if (!book.isBorrowed()) {
//                        book.borrow();
//                        System.out.println("Book borrowed successfully!");
//                    } else {
//                        System.out.println("This book is already borrowed.");
//                    }
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                System.out.println("No book found with that ISBN.");
//            }
//        }
//
//        public void returnBook() {
//            System.out.print("Enter ISBN of the book to return: ");
//            String isbn = scanner.nextLine();
//            boolean found = false;
//
//            for (Book book : books) {
//                if (book.getIsbn().equals(isbn)) {
//                    if (book.isBorrowed()) {
//                        book.returnBook();
//                        System.out.println("Book returned successfully!");
//                    } else {
//                        System.out.println("This book was not borrowed.");
//                    }
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                System.out.println("No book found with that ISBN.");
//            }
//        }
//
//        public void menu() {
//            while (true) {
//                System.out.println("\nLibrary Management System");
//                System.out.println("1. Add Book");
//                System.out.println("2. Display Books");
//                System.out.println("3. Search by Title");
//                System.out.println("4. Search by Author");
//                System.out.println("5. Borrow Book");
//                System.out.println("6. Return Book");
//                System.out.println("7. Exit");
//
//                System.out.print("Choose an option: ");
//                int choice = Integer.parseInt(scanner.nextLine());
//
//                switch (choice) {
//                    case 1:
//                        addBook();
//                        break;
//                    case 2:
//                        displayBooks();
//                        break;
//                    case 3:
//                        searchByTitle();
//                        break;
//                    case 4:
//                        searchByAuthor();
//                        break;
//                    case 5:
//                        borrowBook();
//                        break;
//                    case 6:
//                        returnBook();
//                        break;
//                    case 7:
//                        System.out.println("Exiting the system. Goodbye!");
//                        return;
//                    default:
//                        System.out.println("Invalid choice. Please try again.");
//                }
//            }
//        }
//
//        public static void main(String[] args) {
////            LibraryManagementSystem library = new LibraryManagementSystem();
//            library.menu();
//        }
//    }
//
//
//
//
//
//}
