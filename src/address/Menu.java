package address;

import java.util.Scanner;

public class Menu {

    /**
     * Displays the menu to the screen.
     *
     * @return the user's menu selection
     */
    public static String displayMenu()
    {
        Scanner scanChoice = new Scanner(System.in);

        System.out.println("*************************\n" +
                "Please enter your menu selection\n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************");

        return scanChoice.nextLine();
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