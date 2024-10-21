package Exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook(100);

        int choice;
        do {
            System.out.println("\n +++++++++++++++Menu+++++++++++++++++++++++++");

            System.out.println("1. Add contact");
            System.out.println("2. Display contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone: ");
                        String phoneNumber = scanner.nextLine();
                        phonebook.addContact(name, phoneNumber);
                        break;

                    case 2:
                        phonebook.displayContacts();
                        break;

                    case 3:
                        System.out.print("Enter name to search: ");
                        String nameToSearch = scanner.nextLine();
                        phonebook.searchContact(nameToSearch);
                        break;

                    case 4:
                        System.out.print("Enter name to delete: ");
                        String nameToDelete = scanner.nextLine();
                        phonebook.deleteContact(nameToDelete);
                        break;

                    case 5:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid choice");

                }
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        } while (choice != 5);
        scanner.close();
    }
}
