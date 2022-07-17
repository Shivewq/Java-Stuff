package JavaTypes;

/*-----------------------------------------------------------------------------
Practice Name: Name Initials  
Question Number: Challenge question (#5)    

TODO: this program will ask for a full name as input and output the initials of input name.

Author: Shiven
Date and Time Completed: 02-11
-----------------------------------------------------------------------------*/

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your First Name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter your Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Your initials are: " + firstName.charAt(0) + "" + lastName.charAt(0));
        }
         
    }
}
