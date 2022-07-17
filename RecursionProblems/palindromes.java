public class palindromes {
    public static int getPalindrome(String word) {

        if(word.equals("")) {
            System.out.println("no palindromes");;
        } 
        return (word.length() - 2);
        
    }
    public static void main(String[] args)
	{
		System.out.println(getPalindrome("kayak"));
	}
}
