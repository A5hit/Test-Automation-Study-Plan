/*
Create a Contact List Manager using Arrays & Strings.

✅ Features:
1️⃣ Store multiple contacts (name, phone number, email).
2️⃣ Search for a contact by name.
3️⃣ Update or delete contacts.
4️⃣ Display all contacts.

✅ Bonus:

Sort contacts alphabetically.

Implement file storage to save data.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Contact_List_Manager {

    public static void main(String[] args) {

        ContactManager cm = new ContactManager();

        while (true) {
            System.out.println("Welcome to Contact List Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Display all Contacts");
            System.out.println("6. Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name");
                    String name = input.nextLine();
                    System.out.println("Enter Email");
                    String email = input.nextLine();
                    System.out.println("Enter Phone Number");
                    long phone = input.nextLong();
                    cm.addContact(name, phone, email);
                    break;

                case 2:
                    System.out.println("Enter Name");
                    name = input.nextLine();
                    cm.removeContact(name);
                    break;

                case 3:
                    System.out.println("Enter Name");
                    name = input.nextLine();
                    cm.searchContact(name);
                    break;

                case 4:
                    System.out.println("Provide Contact Name you want to update : ");
                    name = input.nextLine();
                    cm.updateContact(name, input);
                    break;

                case 5:
                    cm.displayContacts();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}

class Contact {

    String name;
    long phone;
    String email;

    public Contact(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, long phone, String email) {
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added");
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (name.equals(contact.getName())) {
                System.out.println(contact.getName() + " " + contact.getPhone() + " " + contact.getEmail());
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    public void removeContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
            }
        }
    }

    public void updateContact(String name, Scanner input) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter New Name");
                name = input.nextLine();
                contact.setName(name);
                System.out.println("Enter New Email");
                String email = input.nextLine();
                contact.setEmail(email);
                System.out.println("Enter New Phone");
                long phone = input.nextLong();
                contact.setPhone(phone);

            }
        }
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getPhone() + " " + contact.getEmail());
        }
    }


}