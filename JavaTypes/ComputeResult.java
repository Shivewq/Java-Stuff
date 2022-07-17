package JavaTypes;

public class ComputeResult {
 
	public static void main(String[] args) {
 

	String original = "software";
	String result = new String("hi");
	//int index = original.indexOf('a');

	//result = index; //error, a string can't be typecasted into an int 
	result = result + original.substring(0,1); // gets characters between index 0 to 1 ('s'), then adds it to result to output "his"
	result = result + " " + original.length(); // outputs 'hi' and "7" together, as that's the character length of "software"
    result = result.replace('i', 'j'); // .repalce syntax is (searchChar, newChar) where i is replaced with j. 
    
        System.out.println(result);
    }
}