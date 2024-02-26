package address.data;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

}