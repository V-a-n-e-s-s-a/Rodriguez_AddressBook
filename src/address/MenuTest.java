package address;

import address.data.AddressBook;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    /**
     * ByteArrayOutputStream captures the output that is displayed.
     *
     * Used for testDisplayMenu.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Stores System.out.
     *
     * Used for testDisplayMenu.
     */
    private final PrintStream originalOut = System.out;

    /**
     * Method to set up the test before each test method runs.
     *
     * Used for testDisplayMenu.
     */
    @org.junit.jupiter.api.BeforeEach
    public void setUpStreams()
    {
        /**
         * Redirect standard output stream to outContent.
         */
        System.setOut(new PrintStream(outContent));
    }

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

}