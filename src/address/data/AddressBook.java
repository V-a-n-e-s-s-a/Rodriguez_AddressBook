package address.data;

import java.util.*; // brings in all classes from the java.util
import java.io.*; // necessary for file reading
/**
 * @author Vanessa Rodriguez
 *
 * AddressBook is a class that represents and contains every possible
 * growing and/or shrinking "list" of AddressEntries.
 * It contains operations such as search/find, addition, and removal
 * of AddressEntries.
 */

public class AddressBook {

    /**
     * List of address entries stored in addressEntryList.
     */
    List<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * Method that lists all entries from the AddressBook in order by
     * the person's last name.
     */
    public void list()
    {
        /**
         * Sort the list alphabetically by last name.
         */
        Collections.sort(addressEntryList, Comparator.comparing(AddressEntry::getLastName));

        /**
         * List the entries.
         */
        for (AddressEntry entry : addressEntryList)
        {
            System.out.println(entry.toString());
        }
    }

    /**
     * Removing of an AddressEntry from the AddressBook based on
     * contact's last name.
     * @param lastName is the contact's last name
     */
    public void remove(String lastName)
    {
        /**
         * Remove AddressEntry based on person's last name.
         */
        addressEntryList.removeIf(entry -> entry.getLastName().equals(lastName));
    }

    /**
     * Method that adds new AddressEntry object to the addressEntryList.
     * @param entry is the entry being added to the list
     */
    public void add(AddressEntry entry)
    {
        addressEntryList.add(entry);

        /**
         * Sort the list alphabetically by last name.
         */
        Collections.sort(addressEntryList, Comparator.comparing(AddressEntry::getLastName));
    }

    /**
     * Read from the file.
     *
     * @param filename is the name of the file we are reading from
     * @throws FileNotFoundException throws an error if the file is not found
     */
    public void readFromFile(String filename) throws FileNotFoundException
    {
        /**
         * Open the file.
         */
        File file = new File(filename);

        /**
         * Scan each line.
         * Display output.
         */
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
        {
            System.out.println(scan.nextLine());
        }
    }

    /**
     * Find and return all entries that start with first part of person's last name.
     *
     * @param startOf_lastName is the person's last name that is used to find
     * @return the entries that start with the person's last name
     */
    public Set<AddressEntry> find(String startOf_lastName)
    {
        /**
         * Create a set to store the matching entries.
         */
        Set<AddressEntry> setOfEntries = new HashSet<>();

        /**
         * Iterate over all entries in the AddressBook.
         * Check if the last name of the entry starts with the
         * specified string.
         */
        for (AddressEntry entry : addressEntryList)
        {
            if (entry.getLastName().startsWith(startOf_lastName))
            {
                setOfEntries.add(entry);
            }
        }

        return setOfEntries;
    }

}
