import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int num=sc.nextInt();
        int Fact=Factorial(num);
        System.out.println(Fact);
    }

    public static int Factorial(int num) {
        int Fact=1;
        int i=2;
        if(num<2){
            return 1;
        }
        while(i <= num ){
            Fact=Fact*i;
            i++;
        }
        return Fact;

        
    }
}
