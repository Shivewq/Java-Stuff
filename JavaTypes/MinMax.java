

/*-----------------------------------------------------------------------------
Practice Name: Java Types - find max & min number in 4 numbers         
Question Number: #6   

Todo:
Use loops to loop through the amount of numbers input
 compare each number to max value
 stop & print max value

    Need to find average of all nums

Author: Shiven
Date and Time Completed: 02-15
-----------------------------------------------------------------------------*/
package JavaTypes;
import java.util.Scanner;
public class MinMax {


    public static void main(String[] args) {
        try (Scanner cnsl = new Scanner(System.in)) {
            int max;
            int k[] = new int[4];
            
            System.out.println("Enter the numbers: ");
            
            for(int i=0; i < 4; i++){
                k[i] = cnsl.nextInt();
            }
            
            max = k[0];

            for(int i=0; i < 4; i++){
                if(max < k[i]){
                    max = k[i];
                }
            }
            System.out.println(max);
        }

    }
}
