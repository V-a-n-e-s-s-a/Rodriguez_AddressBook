package address;

import address.data.AddressBook;

import java.io.FileNotFoundException;

/**
 * @author Vanessa Rodriguez
 *
 * AddressBookApplication is a class that uses Menu classes and AddressBook.
 */

public class AddressBookApplication
{
    /**
     * The main method of the application.
     *
     * @param args is the command line arguments.
     * @throws FileNotFoundException if a file is not found during file operations
     */
    public static void main(String[] args) throws FileNotFoundException {

        /**
         * Creates an instance of AddressBook called addressBook.
         */
        AddressBook addressBook = new AddressBook();

        /**
         * Displays the menu using Menu class.
         */
        Menu.displayMenu(addressBook, "");
    }
}