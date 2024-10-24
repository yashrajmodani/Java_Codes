package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    private Map<String, String> contacts;   //Declaring a map to store contacts

    //constructor
    public Phonebook() {
        contacts = new HashMap<>();
    }

    //method to execute the first set of instructions for the user
    public void initial() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Phonebook Menu:");
                System.out.println("Press 1 to Add Contact ");
                System.out.println("Press 2 to Display All Contacts");
                System.out.println("Press 3 to Search Contact");
                System.out.println("Press 4 to Delete Contact");
                System.out.println("Press 5 to Exit");
                int ip = scanner.nextInt();
                // Switch the input given to an available function
                switch (ip) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        displayAllContacts();
                        break;
                    case 3:
                        searchContact();
                        break;
                    case 4:
                        deleteContact();
                        break;
                    case 5:
                        System.out.println("You have exit the phonebook operation.");
                        return; // to exit the program directly if user enters 5
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private void addContact() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter contact name:");
            String name = scanner.nextLine();
            System.out.print("Enter contact phone number:");
            String ph_number = scanner.next();

            //checking for an already existing contact
            if (contacts.containsKey(name)) {
                throw new IllegalArgumentException("Already a contact exists with this name");
            }
            else {
                contacts.put(name, ph_number); // Adding the given contact to the map
                System.out.println("Contact added successfully!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayAllContacts() {
        try {
            if (contacts.isEmpty()) {
                throw new RuntimeException("No contacts available in the phonebook");
            }
            //iterating over each contact in the map to print the phone no.
            for (Map.Entry<String, String> n : contacts.entrySet()) {
                System.out.println(n.getKey() + ": " + n.getValue());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void searchContact() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter contact name to search: ");
            String name = scanner.nextLine();

            if (contacts.containsKey(name))// display the phone no if the contact is found
            {
                System.out.println("Contact found: " + name + " Phone no:" + contacts.get(name));
            }

            if (!contacts.containsKey(name))// throws the exception if the contact is not found
            {
                throw new RuntimeException("Contact not found");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteContact() {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter contact name to delete: ");
            String name = scanner.nextLine();

            if (!contacts.containsKey(name)) // throws an exception if the contact is not found
            {
                throw new RuntimeException("Contact not found");
            }
            else {
                contacts.remove(name); // removes the contact from the contacts map
                System.out.println("Contact deleted successfully!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Phonebook ph_book = new Phonebook(); // Creating object of the Phonebook class
        ph_book.initial(); // Calling the initial method to execute the first set of instructions for the user
    }
}