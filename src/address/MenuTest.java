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
     * Tests DisplayMenu.
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

    /**
     * Tests Prompt_FirstName.
     */
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

    /**
     * Tests Prompt_LastName.
     */
    @org.junit.jupiter.api.Test
    public void testPrompt_LastName()
    {
        /**
         * Prepare input(last name) for the test.
         */
        String input = "Smith";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals("Smith", Menu.prompt_LastName());

        // Test 2
        /**
         * Prepare input(last name) for the test.
         */
        input = "Doe";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals("Doe", Menu.prompt_LastName());

        // Failure
        assertNotEquals("NotDoe", "Doe",
                "Wrong last name.");
    }

    /**
     * Tests Prompt_Street.
     */
    @org.junit.jupiter.api.Test
    public void testPrompt_Street()
    {
        /**
         * Prepare input(street) for the test.
         */
        String input = "1111 Address St.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals("1111 Address St.", Menu.prompt_Street());

        // Test 2
        /**
         * Prepare input(street) for the test.
         */
        input = "2222 Address St.";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals("2222 Address St.", Menu.prompt_Street());

        // Failure
        assertNotEquals("2 Address St.", "2222 Address St.",
                "Wrong street.");
    }

    /**
     * Tests Prompt_City.
     */
    @org.junit.jupiter.api.Test
    public void testPrompt_City()
    {
        /**
         * Prepare input(city) for the test.
         */
        String input = "Hayward";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals("Hayward", Menu.prompt_City());

        // Test 2
        /**
         * Prepare input(city) for the test.
         */
        input = "Oakland";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals("Oakland", Menu.prompt_City());

        // Failure
        assertNotEquals("NotOakland", "Oakland",
                "Wrong city.");
    }

    /**
     * Tests Prompt_State.
     */
    @org.junit.jupiter.api.Test
    public void testPrompt_State()
    {
        /**
         * Prepare input(state) for the test.
         */
        String input = "California";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals("California", Menu.prompt_State());

        // Test 2
        /**
         * Prepare input(state) for the test.
         */
        input = "IL";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals("IL", Menu.prompt_State());

        // Failure
        assertNotEquals("Not IL", "IL",
                "Wrong state.");
    }

    /**
     * Tests Prompt_Zip.
     */
    @org.junit.jupiter.api.Test
    public void testPrompt_Zip()
    {
        /**
         * Prepare input(zip code) for the test.
         */
        String input = "11111";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        /**
         * Compare actual and expected output.
         */
        assertEquals(11111, Menu.prompt_Zip());

        // Test 2
        /**
         * Prepare input(zip code) for the test.
         */
        input = "22222";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);

        /**
         * Compare actual and expected output.
         */
        assertEquals(22222, Menu.prompt_Zip());

        // Failure
        assertNotEquals(00000, 22222,
                "Wrong zip code.");
    }

}