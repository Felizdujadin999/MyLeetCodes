package PhoneBookPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
        phoneBook.createContact("Felix", "Joshua", "07047670233", "@fel");
        phoneBook.createContact("Feli", "Josh", "07047670235", "josh@");
        phoneBook.createContact("Fel", "Jo", "07047670231", "@j@");
    }

    @Test
    public void createContactTest() {
        assertNotNull(phoneBook.toString());
    }

    @Test
    public void viewContactTest() {
        phoneBook.viewContact("Felix");
        String expected = """
                ====================
                First Name: Felix
                Last Name: Joshua
                Phone Number: 07047670233
                Email Address: @fel
                ====================""";
        assertEquals(expected, phoneBook.viewContact("Felix").toString());
        System.out.println(phoneBook.viewContact("Feli"));
    }

    @Test
    public void countContactsTest() {
        assertEquals(3, phoneBook.countContacts());
    }

    @Test
    public void editContactTest() {
        phoneBook.editContact("Felix", "fel", "zee", "09077734456");
        String edited = """
                ====================
                First Name: fel
                Last Name: zee
                Phone Number: 09077734456
                Email Address: @fel
                ====================""";
        assertEquals(edited, phoneBook.viewContact("fel").toString());
    }

    @Test
    public void deleteContact() {
        phoneBook.deleteContact("Fel");
        System.out.println(phoneBook.viewContact("Fel"));
        assertEquals(2, phoneBook.countContacts());
    }

    @Test
    public void viewAllContactTest() {
        System.out.println(phoneBook.viewAllContacts());
    }
}