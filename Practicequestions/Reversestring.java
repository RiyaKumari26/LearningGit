package Practicequestions;
import java.util.Scanner;

public class Reversestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string for reverse proceudre");
        String str = sc.nextLine(); 
        System.out.println(reverse(str));
    }
    
    public static String reverse(String in){
        if(in==null){
            throw new IllegalArgumentException("Null is not valid input");

        }
        String result="";
        for(int i=in.length()-1;i>-0;i--){
            result += in.charAt(i); 
        }
        return result;




    }
    
}