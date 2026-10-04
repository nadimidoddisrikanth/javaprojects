import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book details
    public void displayBook() {
        System.out.println(
                "ID: " + id +
                        " | Title: " + title +
                        " | Author: " + author +
                        " | Status: " +
                        (available ? "Available" : "Issued")
        );
    }
}


// Member class
class Member {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayMember() {
        System.out.println(
                "Member ID: " + id +
                        " | Name: " + name
        );
    }
}


// Library class
class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Display all books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- BOOK LIST ---");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search book
    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Add member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully.");
    }

    // Display members
    public void displayMembers() {

        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        System.out.println("\n--- MEMBER LIST ---");

        for (Member member : members) {
            member.displayMember();
        }
    }

    // Issue book
    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return book
    public void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is already available.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}


// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     LIBRARY MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. Display Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, title, author);

                    library.addBook(book);

                    break;


                case 2:

                    library.displayBooks();

                    break;


                case 3:

                    sc.nextLine();

                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();

                    library.searchBook(searchTitle);

                    break;


                case 4:

                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String memberName = sc.nextLine();

                    Member member = new Member(memberId, memberName);

                    library.addMember(member);

                    break;


                case 5:

                    library.displayMembers();

                    break;


                case 6:

                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    library.issueBook(issueId);

                    break;


                case 7:

                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);

                    break;


                case 8:

                    System.out.println("Thank you for using Library Management System.");

                    break;


                default:

                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
