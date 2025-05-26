package poo1;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.println("Contact already exists. Duplicate not added.");
        } else {
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void searchContacts(String keyword) {
        boolean found = false;
        System.out.println("\nSearch Results for \"" + keyword + "\":");
        for (Contact c : contacts) {
            if (c.matches(keyword)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found.");
        }
    }

    public void displayAllContacts() {
        System.out.println("\n--- All Contacts ---");
        if (contacts.isEmpty()) {
            System.out.println("No contacts in address book.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
}
