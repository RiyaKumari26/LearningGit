package Practicequestions;
import java.util.Scanner;
public class Negativepositivezero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numer");
        int a=sc.nextInt();
        if(a < 0){
            System.out.println("negative"+a);

        }
        else if(a>0){
            System.out.println("positive"+a);

        }
        else{
            System.out.println("zero"+a);

        }

    }
}
