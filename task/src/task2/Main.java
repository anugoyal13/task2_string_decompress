/*Programme for the task2 to decompress a compressed string
 *written by : Anu Goyal 
 *Date :04-aug-2021
 */


package task2;

import java.util.Scanner; //  import the scanner class

public class Main {
	
    public static void main(String[] args) {
    	
    	DecompressString decompresString = new DecompressString();  // creating object of DecompressString class to access their methods.

        Scanner scanner = new Scanner(System.in);  //creating object of Scanner predefined class to access existing  method in that class.
        
        System.out.println("Please enter compressed input string: ");
        
        String string = scanner.nextLine(); //taking user input
                
         System.out.println("Decompressed output is: " + decompresString.decompress(string));  //calling method of DecompressString class to print the final output.
    }
}