package Practicequestions;
import java.util.Scanner;

public class Vowelcheck {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Check if the string contains vowels using the stringContainsVowels method
        if (Vowels(str)) {
            System.out.println("The string contains vowels.");
        } else {
            System.out.println("The string does not contain vowels.");
        }
        
        // Close the scanner object to prevent memory leaks
        sc.close();
    }

    // Method to check if a string contains vowels
    public static boolean Vowels(String input) {
        // Convert the string to lowercase and check if it contains any vowels
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
