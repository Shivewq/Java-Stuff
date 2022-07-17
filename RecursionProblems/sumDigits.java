import java.util.Scanner;

public class sumDigits {
    
    public static int sumDigit(int num) {

        if (num <= 0) {
            return 0;
        } else {
            return (num % 10 + sumDigit(num/10));
        } 
    }
    public static void main(String[] args)
	{
		System.out.println(sumDigit(126));
	}
}
