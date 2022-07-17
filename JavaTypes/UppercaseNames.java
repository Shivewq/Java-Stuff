/*-----------------------------------------------------------------------------
Practice Name: Uppercase Names       
Question Number: #1    

TODO: This small program asks for a name as an input and will output name in Uppercase

Author:
Date and Time Completed: 02-12
-----------------------------------------------------------------------------*/
package JavaTypes;

import java.util.Scanner;
 
public class UppercaseNames {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");

            String name = scanner.nextLine();

            System.out.print(name.toUpperCase());
        }
    }
}
