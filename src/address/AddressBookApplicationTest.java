package address;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Vanessa Rodriguez
 *
 * Test class for AddressBookApplication class.
 */

class AddressBookApplicationTest {

    /**
     * ByteArrayOutputStream captures the output that is displayed.
     *
     * Used for testMain.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Stores System.out.
     *
     * Used for testMain.
     */
    private final PrintStream originalOut = System.out;

    /**
     * Method to set up the test before each test method runs.
     *
     * Used for testMain.
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
     * Used for testMain.
     */
    @org.junit.jupiter.api.AfterEach
    public void restoreStreams()
    {
        /**
         * Restore standard output to its original value.
         */
        System.setOut(originalOut);
    }

    @org.junit.jupiter.api.Test
    public void testMain() throws FileNotFoundException {
        /**
         * Prepare input(f - quits) for the test.
         */
        String input = "f";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Run the main method.
         */
        AddressBookApplication.main(new String[]{});

        /**
         * The output expected.
         */
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
        assertNotEquals("Incorrect output", expectedOutput,
                "Invalid output.");

    }
}