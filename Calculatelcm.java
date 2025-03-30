import java.util.Scanner;

public class Calculatelcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int lcm = Calclcm(first, second);
        System.out.println("LCM of " + first + " and " + second + " is: " + lcm);
    }

    public static int Calclcm(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0; // Although this will never be reached because the loop will find the LCM
    }
}
