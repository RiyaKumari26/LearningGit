import java.util.Scanner;
public class Sumdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int num=sc.nextInt();
        int Sum=SumofDigits(num);
        System.out.println(Sum);

    }
    public static int SumofDigits(int num) {
        int sum=0;
        while(num>0){
            sum=sum+ (num%10);
            num=num/10;
        }
        return sum;

}
}