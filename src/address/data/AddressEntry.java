package address.data;

/**
 * @author Vanessa Rodriguez
 *
 * AddressEntry is a class to represent a contact in the AddressBook,
 * It contains contact information, i.e., first name, last name,
 * street, city, state, zip code, phone number, and email
 * for the related person.
 */

public class AddressEntry {

    /**
     * Attributes of the class.
     */

    /**
     * Contact's first name.
     */
    private String firstName;
    /**
     * Contact's last name.
     */
    private String lastName;
    /**
     * Contact's street name.
     */
    private String street;
    /**
     * Contact's city name.
     */
    private String city;
    /**
     * Contact's state name.
     */
    private String state;
    /**
     * Contact's zip code.
     */
    private int zip;
    /**
     * Contact's phone number.
     */
    private String phone;
    /**
     * Contact's email.
     */
    private String email;

    /**
     * Default constructor.
     */
    public AddressEntry()
    {
        /**
         * Initialize default values to nothing.
         */
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.phone = "";
        this.email = "";
    }

    /**
     * Create instance and initialize all attribute values.
     * Parameterized constructor.
     * @param firstName is the contact's first name
     * @param lastName is the contact's last name
     * @param street is the contact's street name
     * @param city is the city where the contact lives
     * @param state is the state where the contact lives
     * @param zip is the zip code where the contact lives
     * @param phone is the contact's phone number
     * @param email is the contact's email
     */
    public AddressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String phone, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Method for printing.
     * Returns formatted information of the contact.
     * @return Formatted information of the contact.
     */
    public String toString()
    {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nStreet: " + street +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nPhone: " + phone +
                "\nEmail: " + email + "\n";
    }

    /**
     * Getters and setters.
     */

    /**
     * Set the contact's first name.
     * @param firstname is the contact's first name.
     */
    public void setFirstName(String firstname)
    {
        this.firstName = firstName;
    }

    /**
     * Get and return the contact's first name.
     * @return The contact's first name.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Set the contact's last name.
     * @param lastName is the contact's last name.
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Get and return the contact's last name.
     * @return The contact's last name.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set the contact's street name
     * @param street is the contact's street name.
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * Get and return the contact's street name.
     * @return The contact's street name.
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Set the city where contact lives.
     * @param city is the city where contact lives.
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * Get and return the city where contact lives.
     * @return The city where the contact lives.
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Set the state where contact lives.
     * @param state is the state where contact lives.
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Get and return the state where contact lives.
     * @return The state where contact lives.
     */
    public String getState()
    {
        return state;
    }

    /**
     * Set the zip code where the contact lives.
     * @param zip is the zip code where contact lives.
     */
    public void setZip(Integer zip)
    {
        this.zip = zip;
    }

    /**
     * Get and return the zip code where the contact lives
     * @return The zip code where contact lives.
     */
    public int getZip()
    {
        return zip;
    }

    /**
     * Set the contact's phone number.
     * @param phone is the contact's phone number.
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * Get and return the contact's phone number.
     * @return The contact's phone number.
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Set the contact's email.
     * @param email is the contact's email.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Get and return the contact's email.
     * @return The contact's email.
     */
    public String getEmail()
    {
        return email;
    }

}
