import java.util.Scanner;
public class Mult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        MultTable(num);
        

    }
    public static void MultTable(int num){
        int i=1;
        int number=1;
        while(i <= 10){
            
            System.out.println(num + "*" + i + "=" + number);
            i++;
            number=num*i;
        }



    }
    
}
