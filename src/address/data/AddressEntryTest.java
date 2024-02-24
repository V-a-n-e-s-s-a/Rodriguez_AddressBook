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

}