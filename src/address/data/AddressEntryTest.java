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

    /**
     * Tests getFirstName.
     */
    @org.junit.jupiter.api.Test
    void testGetFirstName()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("John", addressEntry.getFirstName());
    }

    /**
     * Tests setLastName.
     */
    @org.junit.jupiter.api.Test
    public void testSetLastName()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setLastName("Gonzales");
        assertEquals("Gonzales", addressEntry.getLastName());
    }

    /**
     * Tests getLastName.
     */
    @org.junit.jupiter.api.Test
    public void testGetLastName()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("Doe", addressEntry.getLastName());
    }

    /**
     * Tests setStreet.
     */
    @org.junit.jupiter.api.Test
    public void testSetStreet()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setStreet("456 Main St");
        assertEquals("456 Main St", addressEntry.getStreet());
    }

    /**
     * Tests getStreet.
     */
    @org.junit.jupiter.api.Test
    public void testGetStreet()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("123 Main St", addressEntry.getStreet());
    }

    /**
     * Tests setCity.
     */
    @org.junit.jupiter.api.Test
    public void testSetCity()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setCity("City");
        assertEquals("City", addressEntry.getCity());
    }

    /**
     * Tests getCity.
     */
    @org.junit.jupiter.api.Test
    public void testGetCity()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("Alameda", addressEntry.getCity());
    }

    /**
     * Tests setState.
     */
    @org.junit.jupiter.api.Test
    public void testSetState()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setState("State");
        assertEquals("State", addressEntry.getState());
    }

    /**
     * Tests getState.
     */
    @org.junit.jupiter.api.Test
    public void testGetState()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("California", addressEntry.getState());
    }

    /**
     * Tests setZip.
     */
    @org.junit.jupiter.api.Test
    public void testSetZip()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setZip(11111);
        assertEquals(11111, addressEntry.getZip());
    }

    /**
     * Tests getZip.
     */
    @org.junit.jupiter.api.Test
    public void testGetZip()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals(12345, addressEntry.getZip());
    }

    /**
     * Tests setPhone.
     */
    @org.junit.jupiter.api.Test
    public void testSetPhone()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        addressEntry.setPhone("222-2222");
        assertEquals("222-2222", addressEntry.getPhone());
    }

    /**
     * Tests getPhone.
     */
    @org.junit.jupiter.api.Test
    public void testGetPhone()
    {
        AddressEntry addressEntry = new AddressEntry("John", "Doe",
                "123 Main St", "Alameda", "California", 12345,
                "111-1111", "john@example.com");
        assertEquals("111-1111", addressEntry.getPhone());
    }

}