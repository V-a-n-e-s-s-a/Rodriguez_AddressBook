package address.data;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Vanessa Rodriguez
 *
 * Test class for AddressEntry class.
 */
class AddressEntryTest {

    /**
     * Tests default constructor.
     */
    @org.junit.jupiter.api.Test
    public void testDefaultConstructor()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry();

        /**
         * Compare actual and expected output.
         */
        assertEquals("", addressEntry.getFirstName());
        assertEquals("", addressEntry.getLastName());
        assertEquals("", addressEntry.getStreet());
        assertEquals("", addressEntry.getCity());
        assertEquals("", addressEntry.getState());
        assertEquals(0, addressEntry.getZip());
        assertEquals("", addressEntry.getPhone());
        assertEquals("", addressEntry.getEmail());
    }

    /**
     * Tests parameterized constructor.
     */
    @org.junit.jupiter.api.Test
    public void testParameterizedContructor()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("John", addressEntry.getFirstName());
        assertEquals("Doe", addressEntry.getLastName());
        assertEquals("123 Main St", addressEntry.getStreet());
        assertEquals("Alameda", addressEntry.getCity());
        assertEquals("California", addressEntry.getState());
        assertEquals(12345, addressEntry.getZip());
        assertEquals("111-1111", addressEntry.getPhone());
        assertEquals("john@example.com", addressEntry.getEmail());

    }

    /**
     * Test toString(), method for printing.
     */
    @org.junit.jupiter.api.Test
    public void testToString()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("John\nDoe\n123 Main St\nAlameda\nCalifornia\n" +
                "12345\n111-1111\njohn@example.com\n", addressEntry.toString());

        // Failure
        assertNotEquals("Wrong format", addressEntry.toString(),
                "Invalid format.");
    }

    /**
     * Tests setFirstName.
     */
    @org.junit.jupiter.api.Test
    public void testSetFirstName()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setFirstName("Bob");
        assertEquals("Bob", addressEntry.getFirstName());

        // Failure
        assertNotEquals("WrongName", addressEntry.getFirstName(),
                        "Invalid first name.");

        // Test two
        addressEntry.setFirstName("Name");
        assertEquals("Name", addressEntry.getFirstName());

        // Failure
        assertNotEquals("WrongName", addressEntry.getFirstName(),
                "Invalid first name.");
    }

    /**
     * Tests getFirstName.
     */
    @org.junit.jupiter.api.Test
    void testGetFirstName()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("John", addressEntry.getFirstName());

        // Failure
        assertNotEquals("WrongName", addressEntry.getFirstName(),
                "Invalid first name.");

        // Test two
        addressEntry.setFirstName("Name");
        assertEquals("Name", addressEntry.getFirstName());

        // Failure
        assertNotEquals("WrongName", addressEntry.getFirstName(),
                "Invalid first name.");
    }

    /**
     * Tests setLastName.
     */
    @org.junit.jupiter.api.Test
    public void testSetLastName()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setLastName("Gonzales");
        assertEquals("Gonzales", addressEntry.getLastName());

        // Failure
        assertNotEquals("WrongLastName", addressEntry.getLastName(),
                "Invalid last name.");

        // Test two
        addressEntry.setLastName("Lastname");
        assertEquals("Lastname", addressEntry.getLastName());

        // Failure
        assertNotEquals("WrongLastName", addressEntry.getLastName(),
                "Invalid last name.");
    }

    /**
     * Tests getLastName.
     */
    @org.junit.jupiter.api.Test
    public void testGetLastName()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("Doe", addressEntry.getLastName());

        // Failure
        assertNotEquals("WrongLastName", addressEntry.getLastName(),
                "Invalid last name.");

        // Test two
        addressEntry.setLastName("Lastname");
        assertEquals("Lastname", addressEntry.getLastName());

        // Failure
        assertNotEquals("WrongLastName", addressEntry.getLastName(),
                "Invalid last name.");
    }

    /**
     * Tests setStreet.
     */
    @org.junit.jupiter.api.Test
    public void testSetStreet()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setStreet("456 Main St");
        assertEquals("456 Main St", addressEntry.getStreet());

        // Failure
        assertNotEquals("WrongStreet", addressEntry.getStreet(),
                "Invalid street.");

        // Test two
        addressEntry.setStreet("111 Street Name");
        assertEquals("111 Street Name", addressEntry.getStreet());

        // Failure
        assertNotEquals("WrongStreet", addressEntry.getStreet(),
                "Invalid street.");
    }

    /**
     * Tests getStreet.
     */
    @org.junit.jupiter.api.Test
    public void testGetStreet()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("123 Main St", addressEntry.getStreet());

        // Failure
        assertNotEquals("WrongStreet", addressEntry.getStreet(),
                "Invalid street.");

        // Test two
        addressEntry.setStreet("111 Street Name");
        assertEquals("111 Street Name", addressEntry.getStreet());

        // Failure
        assertNotEquals("WrongStreet", addressEntry.getStreet(),
                "Invalid street.");
    }

    /**
     * Tests setCity.
     */
    @org.junit.jupiter.api.Test
    public void testSetCity()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setCity("City");
        assertEquals("City", addressEntry.getCity());

        // Failure
        assertNotEquals("WrongCity", addressEntry.getCity(),
                "Invalid city.");

        // Test two
        addressEntry.setCity("City2");
        assertEquals("City2", addressEntry.getCity());

        // Failure
        assertNotEquals("WrongCity", addressEntry.getCity(),
                "Invalid city.");
    }

    /**
     * Tests getCity.
     */
    @org.junit.jupiter.api.Test
    public void testGetCity()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("Alameda", addressEntry.getCity());

        // Failure
        assertNotEquals("WrongCity", addressEntry.getCity(),
                "Invalid city.");

        // Test two
        addressEntry.setCity("City2");
        assertEquals("City2", addressEntry.getCity());

        // Failure
        assertNotEquals("WrongCity", addressEntry.getCity(),
                "Invalid city.");
    }

    /**
     * Tests setState.
     */
    @org.junit.jupiter.api.Test
    public void testSetState()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setState("State");
        assertEquals("State", addressEntry.getState());

        // Failure
        assertNotEquals("WrongState", addressEntry.getState(),
                "Invalid state.");

        // Test two
        addressEntry.setState("State2");
        assertEquals("State2", addressEntry.getState());

        // Failure
        assertNotEquals("WrongState", addressEntry.getState(),
                "Invalid state.");
    }

    /**
     * Tests getState.
     */
    @org.junit.jupiter.api.Test
    public void testGetState()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("California", addressEntry.getState());

        // Failure
        assertNotEquals("WrongState", addressEntry.getState(),
                "Invalid state.");

        // Test two
        addressEntry.setState("State2");
        assertEquals("State2", addressEntry.getState());

        // Failure
        assertNotEquals("WrongState", addressEntry.getState(),
                "Invalid state.");
    }

    /**
     * Tests setZip.
     */
    @org.junit.jupiter.api.Test
    public void testSetZip()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setZip(11111);
        assertEquals(11111, addressEntry.getZip());

        // Failure
        assertNotEquals(0, addressEntry.getZip(),
                "Invalid zip code.");

        // Test two
        addressEntry.setZip(22222);
        assertEquals(22222, addressEntry.getZip());

        // Failure
        assertNotEquals(0, addressEntry.getZip(),
                "Invalid zip code.");
    }

    /**
     * Tests getZip.
     */
    @org.junit.jupiter.api.Test
    public void testGetZip()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals(12345, addressEntry.getZip());

        // Failure
        assertNotEquals(0, addressEntry.getZip(),
                "Invalid zip code.");

        // Test two
        addressEntry.setZip(22222);
        assertEquals(22222, addressEntry.getZip());

        // Failure
        assertNotEquals(0, addressEntry.getZip(),
                "Invalid zip code.");
    }

    /**
     * Tests setPhone.
     */
    @org.junit.jupiter.api.Test
    public void testSetPhone()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setPhone("222-2222");
        assertEquals("222-2222", addressEntry.getPhone());

        // Failure
        assertNotEquals("000-0000", addressEntry.getPhone(),
                "Invalid phone number.");

        // Test two
        addressEntry.setPhone("333-3333");
        assertEquals("333-3333", addressEntry.getPhone());

        // Failure
        assertNotEquals("000-0000", addressEntry.getPhone(),
                "Invalid phone number.");
    }

    /**
     * Tests getPhone.
     */
    @org.junit.jupiter.api.Test
    public void testGetPhone()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("111-1111", addressEntry.getPhone());

        // Failure
        assertNotEquals("000-0000", addressEntry.getPhone(),
                "Invalid phone number.");

        // Test two
        addressEntry.setPhone("333-3333");
        assertEquals("333-3333", addressEntry.getPhone());

        // Failure
        assertNotEquals("000-0000", addressEntry.getPhone(),
                "Invalid phone number.");
    }

    /**
     * Tests setEmail.
     */
    @org.junit.jupiter.api.Test
    public void testSetEmail()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        addressEntry.setEmail("email@email.com");
        assertEquals("email@email.com", addressEntry.getEmail());

        // Failure
        assertNotEquals("wrong@email.com", addressEntry.getEmail(),
                "Invalid email.");

        // Test two
        addressEntry.setEmail("email@address.com");
        assertEquals("email@address.com", addressEntry.getEmail());

        // Failure
        assertNotEquals("wrong@email.com", addressEntry.getEmail(),
                "Invalid email.");
    }

    /**
     * Tests getEmail.
     */
    @org.junit.jupiter.api.Test
    void testGetEmail()
    {
        /**
         * Create an instance of AddressEntry called addressEntry.
         */
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        /**
         * Compare actual and expected output.
         */
        assertEquals("john@example.com", addressEntry.getEmail());

        // Failure
        assertNotEquals("wrong@email.com", addressEntry.getEmail(),
                "Invalid email.");

        // Test two
        addressEntry.setEmail("email@address.com");
        assertEquals("email@address.com", addressEntry.getEmail());

        // Failure
        assertNotEquals("wrong@email.com", addressEntry.getEmail(),
                "Invalid email.");
    }

}