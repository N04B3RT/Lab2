import java.util.Scanner;

public class BookDatabase {
    private String[] isbns;
    private int count;
    private final int MAX_ISBNS = 100;

    public BookDatabase() {
        isbns = new String[MAX_ISBNS];
        count = 0;
    }

    // Validate ISBN
    public boolean validateISBN(String isbn) {
        if (isbn.length() != 13) {
            return false;
        }
        try {
            Long.valueOf(isbn);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // Add a book
    public boolean addBook(String isbn) {
        if (validateISBN(isbn)) {
            if (count < MAX_ISBNS) {
                isbns[count++] = isbn;
                return true;
            } else {
                System.out.println("Database is full. Cannot add more books.");
            }
        } else {
            System.out.println("Invalid ISBN. Please enter a valid 13-digit ISBN.");
        }
        return false;
    }

    // Search for an ISBN
    public boolean searchISBN(String isbn) {
        for (int i = 0; i < count; i++) {
            if (isbns[i].equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    // Print all ISBNs
    public void printAllISBNs() {
        System.out.println("List of ISBNs in the database:");
        for (int i = 0; i < count; i++) {
            System.out.println(isbns[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BookDatabase db = new BookDatabase();
            boolean exit = false;
            
            while (!exit) {
                System.out.println("Book Database Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Search for a Book by ISBN");
                System.out.println("3. Print all ISBNs");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                
                // Validate the user's choice input
                int choice;
                while (true) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                    }
                }
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter ISBN to add: ");
                        String isbnToAdd = scanner.nextLine();
                        db.addBook(isbnToAdd);
                    }
                    case 2 -> {
                        System.out.print("Enter ISBN to search: ");
                        String isbnToSearch = scanner.nextLine();
                        if (db.searchISBN(isbnToSearch)) {
                            System.out.println("Book found.");
                        } else {
                            System.out.println("Book not found.");
                        }
                    }
                    case 3 -> db.printAllISBNs();
                    case 4 -> exit = true;
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    public String[] getIsbns() {
        return isbns;
    }

    public void setIsbns(String[] isbns) {
        this.isbns = isbns;
    }
}
