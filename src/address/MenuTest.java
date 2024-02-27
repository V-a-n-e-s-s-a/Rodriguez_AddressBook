package address;

import address.data.AddressBook;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Vanessa Rodriguez
 *
 * Test class for Menu class.
 */

class MenuTest {

    /**
     * ByteArrayOutputStream captures the output that is displayed.
     *
     * Used for all methods in MenuTest.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Stores System.out.
     *
     * Used for all methods in MenuTest.
     */
    private final PrintStream originalOut = System.out;

    /**
     * Method to set up the test before each test method runs.
     *
     * Used for all methods in MenuTest.
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
     * Tests testDisplayMenu.
     * @throws FileNotFoundException
     */
    @org.junit.jupiter.api.Test
    public void testDisplayMenu() throws FileNotFoundException {

        /**
         * Prepare input(f - quits) for the test.
         */
        String input = "f";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Create an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        Menu.displayMenu(addressBook, "f");

        String expectedOutput = "*************************\n" +
                "Please enter your menu selection\n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************\n" + "Quitting.\n";

        /**
         * Compare actual and expected output.
         */
        assertEquals(expectedOutput, outContent.toString());

        // Failure
        assertNotEquals("Quitting", expectedOutput,
                "Invalid output.");

    }

    @org.junit.jupiter.api.Test
    public void testPrompt_FirstName()
    {
        /**
         * Prepare input(name) for the test.
         */
        String input = "John";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals("John", Menu.prompt_FirstName());

        // Test 2
        /**
         * Prepare input(name) for the test.
         */
        input = "Jane";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals("Jane", Menu.prompt_FirstName());

        // Failure
        assertNotEquals("NotJane", "Jane",
                "Wrong name.");
    }

}