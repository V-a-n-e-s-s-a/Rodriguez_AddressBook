package address.data;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Vanessa Rodriguez
 *
 * Test class for AddressBook class.
 */

class AddressBookTest {

    /**
     * ByteArrayOutputStream captures the output that is displayed.
     *
     * Used for testAddressBook.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Stores System.out.
     *
     * Used for testAddressBook.
     */
    private final PrintStream originalOut = System.out;

    /**
     * Method to set up the test before each test method runs.
     *
     * Used for testAddressBook.
     */
    @org.junit.jupiter.api.BeforeEach
    public void setUpStreams()
    {
        /**
         * Redirect standard output stream to outContent.
         */
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Method to restore System.out after each test method runs.
     *
     * Used for testAddressBook.
     */
    @org.junit.jupiter.api.AfterEach
    public void restoreStreams()
    {
        /**
         * Restore standard output to its original value.
         */
        System.setOut(originalOut);
    }

    /**
     * Tests the behavior of AddressBook and makes sure 2 address
     * entries are in the list.
     */
    @org.junit.jupiter.api.Test
    public void testAddressBook()
    {
        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Create two instances of AddressEntry.
         */
        AddressEntry entry1 = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        AddressEntry entry2 = new AddressEntry("Jane", "Smith", "456 Oak St", "Aspen",
                "Colorado", 67891, "222-2222", "jane@example.com");

        /**
         * Add AddressEntry instances to the AddressBook - 2 tests.
         */
        addressBook.add(entry1);
        addressBook.add(entry2);

        /**
         * Allows to display contacts that are currently in the list.
         */
        addressBook.list();
        String contentsOfList = outContent.toString();

        /**
         * What the output is expected to look like.
         */
        String expectedOutput = entry1.toString() + "\n" + entry2.toString() + "\n";

        /**
         * Compare actual and expected output.
         */
        assertEquals(expectedOutput, contentsOfList);

        // Failure
        assertNotEquals("Incorrect output", expectedOutput,
                "Invalid output.");

    }
    /**
     * Tests method that adds a contact to the list.
     */
    @org.junit.jupiter.api.Test
    public void testAddAddress()
    {
        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Create two instance of AddressEntry.
         */
        AddressEntry entry1 = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        AddressEntry entry2 = new AddressEntry("Jane", "Smith", "456 Oak St", "Aspen",
                "Colorado", 67891, "222-2222", "jane@example.com");

        /**
         * Add AddressEntry instance to the AddressBook.
         */
        addressBook.add(entry1);

        /**
         * Makes sure size of the AddressBook is 1.
         */
        assertEquals(1, addressBook.addressEntryList.size());

        /**
         * index 0 of addressEntryList is entry 1.
         */
        assertEquals(entry1, addressBook.addressEntryList.get(0));

        // Test 2

        addressBook.add(entry2);

        /**
         * Makes sure size of the AddressBook is 2.
         */
        assertEquals(2, addressBook.addressEntryList.size());

        /**
         * index 1 of addressEntryList is entry 2.
         */
        assertEquals(entry2, addressBook.addressEntryList.get(1));

        // Failure
        assertNotEquals(100, addressBook.addressEntryList.size(),
                "Wrong size.");

        assertNotEquals("entry100", addressBook.addressEntryList.get(1),
                "Entry doesn't exist.");

    }

    /**
     * Test find (based on last name).
     */
    @org.junit.jupiter.api.Test
    public void testFind()
    {
        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Create three instances of AddressEntry.
         */
        AddressEntry entry1 = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        AddressEntry entry2 = new AddressEntry("Jane", "Does", "456 Oak St", "Aspen",
                "Colorado", 67891, "222-2222", "jane@example.com");

        AddressEntry entry3 = new AddressEntry("Jane", "Smith", "456 Oak St", "Aspen",
                "Colorado", 67891, "222-2222", "jane@example.com");

        /**
         * Add AddressEntry instances to the AddressBook.
         */
        addressBook.add(entry1);
        addressBook.add(entry2);

        /**
         * Test finding a match for partial lastname.
         */
        Set<AddressEntry> find1 = addressBook.find("Do");

        /**
         * Test to see if two entries have "Do"
         */
        assertEquals(2, find1.size());

        // Test 2
        addressBook.add(entry3);

        /**
         * Test to see if one entry has "Smith"
         */
        Set<AddressEntry> find2 = addressBook.find("Smith");
        assertEquals(1, find2.size());

        // Failure
        assertNotEquals(0, addressBook.find(" "),
                "Did not find entry.");

    }

    @org.junit.jupiter.api.Test
    public void testRemove()
    {
        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Create two instances of AddressEntry.
         */
        AddressEntry entry1 = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        AddressEntry entry2 = new AddressEntry("Jane", "Does", "456 Oak St", "Aspen",
                "Colorado", 67891, "222-2222", "jane@example.com");

        /**
         * Add AddressEntry instances to the AddressBook.
         */
        addressBook.add(entry1);
        addressBook.add(entry2);

        addressBook.remove("Doe");

        assertFalse(addressBook.find("Doe").contains(entry1));

        // Test 2
        addressBook.remove("Smith");

        assertFalse(addressBook.find("Smith").contains(entry1));

        //Failure
        assertNotEquals(2, addressBook.addressEntryList.size(),
                "Did not remove.");
    }

    @org.junit.jupiter.api.Test
    public void testReadFromFile() throws FileNotFoundException {
        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Read from the file.
         */
        addressBook.readFromFile("entries.txt");

        /**
         * Make sure there are currently 5 entries.
         */
        assertEquals(5, addressBook.addressEntryList.size());

        /**
         * Make sure the first entry has the correct information.
         */
        AddressEntry entry1 = addressBook.addressEntryList.get(0);
        assertEquals("Jane", entry1.getFirstName());
        assertEquals("Beppson", entry1.getLastName());
        assertEquals("1231 Fun St.", entry1.getStreet());
        assertEquals("Oakland", entry1.getCity());
        assertEquals("CA", entry1.getState());
        assertEquals(12345, entry1.getZip());
        assertEquals("323-234-5623", entry1.getPhone());
        assertEquals("fun@gmail.com", entry1.getEmail());

        // Test 2

        /**
         * Make sure the second entry has the correct information.
         */
        AddressEntry entry2 = addressBook.addressEntryList.get(1);
        assertEquals("Maddie", entry2.getFirstName());
        assertEquals("Felix", entry2.getLastName());
        assertEquals("2 Fifth Street", entry2.getStreet());
        assertEquals("Hayward", entry2.getCity());
        assertEquals("CA", entry2.getState());
        assertEquals(95010, entry2.getZip());
        assertEquals("510-234-5678", entry2.getPhone());
        assertEquals("felix@yahoo.com", entry2.getEmail());

        // Failure
        assertNotEquals(1, addressBook.addressEntryList.size(),
                "Incorrect size.");

        /**
         * Wrong information.
         */
        AddressEntry entry3 = addressBook.addressEntryList.get(1);
        assertNotEquals("Name", entry3.getFirstName(),
                "Incorrect name.");
        assertNotEquals("LastName", entry3.getLastName(),
                "Incorrect last name.");
        assertNotEquals("Street", entry3.getStreet(),
                "Incorrect street.");
        assertNotEquals("City", entry3.getCity(),
                "Incorrect city.");
        assertNotEquals("State", entry3.getState(),
                "Incorrect state.");
        assertNotEquals(00000, entry3.getZip(), "Incorrect zip.");
        assertNotEquals("000-000-0000", entry3.getPhone(),
                "Incorrect phone number.");
        assertNotEquals("wrong@email.com", entry3.getEmail(),
                "Incorrect email.");
    }
}