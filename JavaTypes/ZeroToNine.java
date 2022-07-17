/*-----------------------------------------------------------------------------
Practice Name: Java Types - Print Zeros based on input    
Question Number: #7 

TODO: setup scanner
    make string variables (so it doesn't add values mathematically, I want string texts to merge together)
    for loop that loops through the input from the user
    make initial value add and equal to zero

Author: Shiven
Date and Time Completed: 02-16
-----------------------------------------------------------------------------*/


package JavaTypes;

import java.util.Scanner;

public class ZeroToNine {
    public static void main(String[] args) {
        try (Scanner cnsl = new Scanner(System.in)) {
            System.out.println("Enter a Number from 0 to 9:");
            int numInput = cnsl.nextInt();
            String zeros = "0";
            String val = "1";
            for(int i = 0; i < numInput; i++){
                val += zeros;
            }

            System.out.println(val);
        }
    }
}
