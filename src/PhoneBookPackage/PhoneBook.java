package PhoneBookPackage;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void createContact(String firstName, String lastName, String phoneNumber, String email) {
        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        newContact.setEmailAddress(email);
        contacts.add(newContact);
    }

    public int countContacts() {
        return contacts.size();
    }

    public void editContact(String name, String newFirstName, String newLastName, String newPhoneNumber) {
        int number = 0;
        for (int index = 0; index < contacts.size(); index++) {
            if (Objects.equals(contacts.get(index).getFirstName(), name)) {
                number = index;}}
        Contact edit = contacts.get(number);
        edit.setPhoneNumber(newPhoneNumber);
        edit.setLastName(newLastName);
        edit.setFirstName(newFirstName);
        contacts.set(number, edit);
    }

    public Contact viewContact(String firstName) {
        Contact newContact = contacts.get(0);
        for (Contact contact : contacts) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContact(String firstName) {
        for (int index = 0; index < contacts.size(); index++) {
            if (contacts.get(index).getFirstName().equals(firstName)){contacts.remove(index);}
        }
    }

    public String viewAllContacts() {
        return contacts.toString();
    }
}