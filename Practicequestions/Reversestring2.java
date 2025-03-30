package Practicequestions;
import java.util.Scanner;

public class Reversestring2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user and read the input string
        System.out.println("Enter string:");
        String str = sc.nextLine();
        
        // Print the result after reversing each word
        System.out.println(Reversedwords(str));
    }

    // Method to reverse each word in the string
    public static String Reversedwords(String word) {
        String[] words = word.split(" ");  // Split the input string into words based on spaces
        String result = "";

        // Loop through each word, reverse it, and append it to the result
        for (String wor : words) {
            result = result + reverse(wor) + " ";  // Reverse each word and add it to the result
        }

        return result.trim();  // Return the result with trailing space removed
    }

    // Method to reverse a single word
    public static String reverse(String in) {
        String reversed = "";  // Initialize an empty string to hold the reversed word

        // Loop through the word in reverse order
        for (int i = in.length() - 1; i >= 0; i--) {
            reversed = reversed + in.charAt(i);  // Append each character in reverse order
        }

        return reversed;  // Return the reversed word
    }
}
