import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even " + a); // Adding a space for clarity
        } else {
            System.out.println("odd " + a); // Adding a space for clarity
        }
    }
}
