import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int gcd=gcd(first,second);
        System.out.println(gcd);

    
    public static int gcd(int first,int second){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        



    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num2;
        }
        else{
            return num1;
        }
}
    }