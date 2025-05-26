package poo1;

import java.util.Scanner;

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name.trim();
        this.phone = phone.trim();
        this.email = email.trim();
    }

    public String getName() {
        return name;
    }

    public boolean matches(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Contact) {
//            Contact other = (Contact) obj;
//            return this.name.equalsIgnoreCase(other.name)
//                    && this.phone.equals(other.phone)
//                    && this.email.equalsIgnoreCase(other.email);
//        }
//        return false;
//    }

    public static void gestordeContactos(){
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;

        do {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact by Name");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    addressBook.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter name or part of it to search: ");
                    String keyword = scanner.nextLine();
                    addressBook.searchContacts(keyword);
                    break;

                case 3:
                    addressBook.displayAllContacts();
                    break;

                case 4:
                    System.out.println("Exiting Contact Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
    }

