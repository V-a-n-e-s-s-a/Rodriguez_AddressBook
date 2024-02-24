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
        AddressEntry addressEntry = new AddressEntry();

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
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

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
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");

        assertEquals("First Name: John" +
                "\nLast Name: Doe" +
                "\nStreet: 123 Main St" +
                "\nCity: Alameda" +
                "\nState: California" +
                "\nZip: 12345" +
                "\nPhone: 111-1111" +
                "\nEmail: john@example.com" + "\n", addressEntry.toString());
    }

    /**
     * Tests setFirstName.
     */
    @org.junit.jupiter.api.Test
    public void testSetFirstName()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setFirstName("Bob");
        assertEquals("Bob", addressEntry.getFirstName());
    }

}