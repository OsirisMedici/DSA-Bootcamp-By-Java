import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter A Number you want to know factorial of: ");
        try (Scanner in = new Scanner(System.in)) {

            int factorial = 1;
            int num = in.nextInt();

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.print("This is your Factoial of " + num + " is: " + factorial);
            // System.out.print(factorial);
        }
    }
}
