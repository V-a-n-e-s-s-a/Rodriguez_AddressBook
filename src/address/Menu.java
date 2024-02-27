package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Vanessa Rodriguez
 *
 * Menu is a class used to display menu options to the user and various
 * prompt methods.
 */

public class Menu {

    /**
     * Displays the menu to the screen.
     * Handles all menu options.
     *
     * @param addressBook is the instance of AddressBook
     * @param choice is the choice the user selects from menu
     * @throws FileNotFoundException is the error thrown if the file is not found
     */
    public static void displayMenu(AddressBook addressBook, String choice) throws FileNotFoundException
    {
        boolean quit = false;
        Scanner scanChoice = new Scanner(System.in);

        /**
         * Quits when the user selects 'n'.
         */
        while (!quit)
        {
            /**
             * Displays menu so that user can make their choice.
             */
            System.out.println("*************************\n" +
                    "Please enter your menu selection\n" +
                    "a) Loading From File\n" +
                    "b) Addition\n" +
                    "c) Removal\n" +
                    "d) Find\n" +
                    "e) Listing\n" +
                    "f) Quit\n" +
                    "*************************");

            choice = scanChoice.nextLine();

            /**
             * The user selected their choice.
             */
            switch (choice)
            {
                /**
                 * User must enter file name(entries.txt) to load the file.
                 */
                case "a":
                    Scanner scanFileName = new Scanner(System.in);
                    System.out.println("Enter in FileName:\n");
                    addressBook.readFromFile(scanFileName.nextLine());
                    break;

                /**
                 * User has selected to add new entry to the AddressBook.
                 */
                case "b":
                    String firstName = prompt_FirstName();
                    String lastName = prompt_LastName();
                    String street = prompt_Street();
                    String city = prompt_City();
                    String state = prompt_State();
                    int zip = prompt_Zip();
                    String phone = prompt_Phone();
                    String email = prompt_Email();

                    AddressEntry entry = new AddressEntry(firstName, lastName,
                            street, city, state, zip, phone, email);

                    addressBook.add(entry);
                    break;

                /**
                 * User has selected to remove entry from the AddressBook
                 * based on last name.
                 */
                case "c":
                    /**
                     * Finds the entries with same last name and displays them to the screen.
                     */
                    Scanner scanLastName = new Scanner(System.in);
                    System.out.println("Enter in Last Name of contact to remove:\n");
                    Set<AddressEntry> matchingEntries = addressBook.find(scanLastName.nextLine());

                    System.out.println("The following entry was found in the address book.\n");
                    for (AddressEntry foundEntry : matchingEntries)
                    {
                        System.out.println(foundEntry);
                    }

                    /**
                     * Removes the entries if user decides to.
                     */
                    Scanner scanYesOrNo = new Scanner(System.in);
                    System.out.println("Hit 'y' to remove the entry or 'n' to return to main menu\n");

                    if (scanYesOrNo.nextLine() == "y")
                    {
                        for (AddressEntry foundEntry : matchingEntries)
                        {
                            addressBook.remove(scanLastName.nextLine());
                        }
                    }
                    break;

                /**
                 * Finds an entry from the AddressBook based on last name.
                 */
                case "d":
                    /**
                     * Finds the entries with same last name and displays them to the screen.
                     */
                    Scanner scanFindLastName = new Scanner(System.in);
                    System.out.println("Enter in all or beginning of last name you wish to find:\n");
                    Set<AddressEntry> entries = addressBook.find(scanFindLastName.nextLine());

                    System.out.println("The following entries were found in the address" +
                            " book for a last name starting with" + scanFindLastName.nextLine() + "\n");

                    for (AddressEntry foundEntry : entries)
                    {
                        System.out.println(foundEntry);
                    }

                    break;

                /**
                 * Lists the contents of AddressBook.
                 */
                case "e":
                    addressBook.list();
                    break;

                /**
                 * User decides to quit.
                 */
                case "f":
                    System.out.println("Quitting.");
                    quit = true;
                    break;
            }
        }
    }

    /**
     * Prompt user to enter name.
     *
     * @return the name entered.
     */
    public static String prompt_FirstName()
    {
        Scanner scanName = new Scanner(System.in);
        System.out.print("First Name:\n");
        return scanName.nextLine();
    }

    /**
     * Prompt user to enter last name.
     *
     * @return the last name entered.
     */
    public static String prompt_LastName()
    {
        Scanner scanLastName = new Scanner(System.in);
        System.out.print("Last Name:\n");
        return scanLastName.nextLine();
    }

    /**
     * Prompt user to enter street name.
     *
     * @return the street name entered.
     */
    public static String prompt_Street()
    {
        Scanner scanStreet = new Scanner(System.in);
        System.out.print("Street:\n");
        return scanStreet.nextLine();
    }

    /**
     * Prompt user to enter city.
     *
     * @return the city entered.
     */
    public static String prompt_City()
    {
        Scanner scanCity = new Scanner(System.in);
        System.out.print("City:\n");
        return scanCity.nextLine();
    }

    /**
     * Prompt user to enter state.
     *
     * @return the state entered.
     */
    public static String prompt_State()
    {
        Scanner scanState = new Scanner(System.in);
        System.out.print("State:\n");
        return scanState.nextLine();
    }

    /**
     * Prompt user to enter zip code.
     *
     * @return the zip code entered.
     */
    public static int prompt_Zip()
    {
        Scanner scanZip = new Scanner(System.in);
        System.out.print("Zip:\n");
        return scanZip.nextInt();
    }

    /**
     * Prompt user to enter phone number.
     *
     * @return the phone number entered.
     */
    public static String prompt_Phone()
    {
        Scanner scanPhone = new Scanner(System.in);
        System.out.print("Telephone:\n");
        return scanPhone.nextLine();
    }

    /**
     * Prompt user to enter email.
     *
     * @return the email entered.
     */
    public static String prompt_Email()
    {
        Scanner scanEmail = new Scanner(System.in);
        System.out.print("Email:\n");
        return scanEmail.nextLine();
    }

}