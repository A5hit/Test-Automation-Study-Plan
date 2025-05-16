package Collections.LibraryBookManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagement {
    private static Map<String, Integer> inventory = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean running = true;

        while (running) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Update Stock");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateStock();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    displayInventory();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting Library System...");
                default:
                    getIntegerInput();
                    break;
            }
        }
    }


    public static void addBook() {
        System.out.println("Ener title of the book");
        String tittle = sc.nextLine();
        System.out.println("Enter Quantity of the book");
        int qty = sc.nextInt();

        inventory.put(tittle, inventory.getOrDefault(tittle, 0) + qty);
        System.out.println("✅ Book added/updated.");
    }

    public static void updateStock() {
        System.out.println("Enter tr title of the book");
        String title = sc.nextLine();

        if (inventory.containsKey(title)) {
            System.out.println("Enter quantity of the book");
            int qty = sc.nextInt();

            inventory.put(title, qty);
            System.out.print("✅ Stock updated.");
        } else {
            System.out.println("❌ Book not found.");
        }
    }

    public static void borrowBook() {
        System.out.println("Enter title of the book");
        String tittle = sc.nextLine();

        if (inventory.containsKey(tittle) && inventory.get(tittle) > 0) {
            inventory.put(tittle, inventory.get(tittle) - 1);
            System.out.print("📚 Book borrowed.");

        }
    }

    public static void returnBook() {
        System.out.println("Enter title of the book");
        String title = sc.nextLine();

        if (inventory.containsKey(title)) {
            inventory.put(title, inventory.get(title) + 1);
        } else {
            inventory.put(title, 1);
        }
        System.out.print("✅ Book returned.");
    }

    public static void displayInventory() {
        System.out.println("\n===== Library Inventory =====");
        if (inventory.isEmpty()) {
            System.out.print("No books in inventory.");
        } else {
            inventory.forEach((title, qty) -> System.out.println("• " + title + " → " + qty + " copies")
            );
        }
    }

    public static int getIntegerInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number");
            }

        }
    }


}
