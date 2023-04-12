package PhoneBookPackage;

import javax.swing.*;
import java.util.ServiceConfigurationError;

public class PhoneBookApp {
    private static final PhoneBook phoneBook = new PhoneBook();

    public static void main(String... args) {
       try{gotoMainMenu();}
       catch (StringIndexOutOfBoundsException er){display("Invalid input.....");
       main();}
    }
    public static void gotoMainMenu(){
        String output = """
                ======================
                       PHONEBOOK
                ======================
                1 -> Create Contact.
                2 -> View Contact.
                3 -> View All Contacts.
                4 -> Count Contacts.
                5 -> Edit Contact.
                6 -> Delete Contact.
                7 -> Exit Application.
                """;
        String userInput = input(output);
        switch (userInput.charAt(0)){
            case '1' -> createContact();
            case '2' -> viewContact();
            case '3' -> viewAllContacts();
            case '4' -> countContacts();
            case '5' -> editContacts();
            case '6' -> deleteContact();
            case '7' -> Exit();
            default -> gotoMainMenu();
        }
    }
    private static void Exit() {
        display("Thanks for using this application");
        System.exit(1);
    }
    private static void deleteContact() {
        String firstName = input("Enter the first name of the contact to be deleted:: ");
        try {
            phoneBook.deleteContact(firstName);
            display("Contact deleted...");
        }catch (IllegalArgumentException| IndexOutOfBoundsException| NullPointerException er){
            display("No contact found.....");
        }
        gotoMainMenu();
    }
    private static void editContacts() {
        String name = input("Enter the name of the contact to be edited:: ");
        String newFirstName = input("Enter new first name:: ");
        String newLastName = input("Enter new last name:: ");
        String newPhoneNumber = input("Enter new phone number:: ");
        try {
            phoneBook.editContact(name,newFirstName,newLastName,newPhoneNumber);
            display("Contact " + name + " has been edited...");
        }catch (IllegalArgumentException| IndexOutOfBoundsException| NullPointerException er){
            display("No Contact info found......");}
        gotoMainMenu();
    }
    private static void countContacts() {
        String numberOfContacts = String.format("""
                You have %s number of contacts on your phone book,,""", phoneBook.countContacts());
        display(numberOfContacts);
        gotoMainMenu();
    }
    private static void viewAllContacts() {
        try {
            display("Loading.....");
            display(phoneBook.viewAllContacts());
        }catch (IllegalArgumentException | IndexOutOfBoundsException| NullPointerException er){
            display("No contact found.....");
        }
        gotoMainMenu();
    }
    private static void viewContact() {
        String firstName = input("Enter firstname of contact to view details:: ");
        try {
            display("Here's your contact.....");
            display(phoneBook.viewContact(firstName).toString());
        }catch (IllegalArgumentException | IndexOutOfBoundsException| NullPointerException er){
            display("No contact found...");}
        gotoMainMenu();
    }
    private static void createContact() {
        String firstName = input("Enter first name of contact:: ");
        String lastName = input("Enter last name of contact:: ");
        String phoneNumber = input("Enter phone number:: ");
        String email = input("Enter email of contact (Optional):: ");
        display("Contact saving....");
        phoneBook.createContact(firstName,lastName,phoneNumber,email);
        display("Contact saved....");
        gotoMainMenu();
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
        // display(prompt);
        // return keyboardInputCollector.nextLine();
    }
    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
        // System.out.println(prompt);
    }
}
