package Java2.Lab2.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    ArrayList<Contact> list = new ArrayList<>();

    public static void main(String[] args) {
        final int SENTINEL = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting phone...");
        ContactList contactList = new ContactList();
        contactList.menu();
        n = scanner.nextInt();

        while (n != SENTINEL) {
            if (n == 1) {
                System.out.println("Contact List");
                contactList.printContact();
            } else if (n == 2) {

                System.out.println("Enter new contact name: ");
                String name = scanner.next();
                System.out.println("Enter phone number: ");
                String phone = scanner.next();
                Contact contact = new Contact(name, phone);
                contactList.addContact(contact);
            } else if (n == 3) {
                System.out.println("Enter existing contact name: ");
                String name = scanner.next();
                Contact oldContact = contactList.searchContact(name);
                System.out.print("Enter new contact name: ");
                String newName = scanner.next();
                System.out.print("Enter phone number: ");
                String newPhone = scanner.next();
                Contact newContact = new Contact(newName, newPhone);
                System.out.println(oldContact + "," + " was replaced with " + newContact);
                System.out.println("Successfully updated record");

                contactList.updateContact(oldContact, newContact);
            } else if (n == 4) {
                System.out.println("Enter existing contact name: ");
                String name = scanner.next();
                Contact oldContact = contactList.searchContact(name);
                System.out.println(name + "," + " was deleted");
                System.out.println("Successfully deleted ");

                contactList.removeContact(oldContact);
            } else if (n == 5) {
                System.out.println("Enter existing contact name: ");
                String name = scanner.next();
                contactList.searchContact(name);
            } else if (n == 6) {
                contactList.menu();

            }
            n = scanner.nextInt();
        }
        System.out.println("Shutting down....");


    }

    public void addContact(Contact contact) {
        list.add(contact);
    }


    public void printContact() {
        for (int i = 0; i < list.size(); i++) {
            Contact ct = list.get(i);
            System.out.println(ct.getName());
            System.out.println(ct.getPhone());
            System.out.println("==========");
        }
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int index = list.indexOf(oldContact);
        if (index != -1) {
            list.set(index, newContact);
        } else {
            System.out.println("Contact khong ton tai");
        }
    }

    public void removeContact(Contact contact) {
        list.remove(contact);
    }

    public Contact searchContact(String contactName) {
        for (int i = 0; i < list.size(); i++) {
            Contact contact = list.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)) {
                System.out.println("Name: " + contact.getName() + " phone number is " + contact.getPhone());
                return contact;
            }
        }
        return null;
    }

    public void menu() {
        System.out.println("Available actions: ");
        System.out.println("press");
        System.out.println("0 - to shut down");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add a new contact");
        System.out.println("3 - to update existing an existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list of available actions.");
        System.out.println("Choose your action:");
        System.out.println("Enter action: (6 to show availble actions)");
    }

}
