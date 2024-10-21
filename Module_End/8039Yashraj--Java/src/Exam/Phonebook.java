package Exam;

public class Phonebook {
    private Contact[] contacts;
    private int Count;

    public Phonebook(int size) {
        contacts = new Contact[size];
        Count = 0;
    }

    // Method to add contact
    public void addContact(String name, String phone){
        if(Count >= contacts.length) {
            System.out.println("Phonebook is full");
            return;
        }
        contacts[Count++] = new Contact(name, phone);
        System.out.println("Contact add successfully");

    }

    // Method to display contact
    public void displayContacts(){
        if (Count == 0) {
            System.out.println("No contacts available");
            return;
        }
        System.out.println("Contacts in the phonebook");
        for (int i = 0;i < Count; i++) {
            System.out.println((i + 1) + ". " + contacts[i].getName() + ": " + contacts[i].getPhone());
        }
    }

    //Method to search contact
    public void searchContact(String name){
        for(int i = 0; i < Count; i++) {
            if(contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + contacts[i].getName() + "- " + contacts[i].getPhone());
                return;
            }
        }
        System.out.println("Contact not found");
    }

    //Method to delete contact
    public void deleteContact(String name){
        for(int i = 0; i < Count; i++) {
            if(contacts[i].getName().equalsIgnoreCase(name)) {

                for (int j = i; j < Count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--Count] = null;
                System.out.println("Contact delete successfully");
                return;
            }
        }
        System.out.println("Contact not found");


    }

}
