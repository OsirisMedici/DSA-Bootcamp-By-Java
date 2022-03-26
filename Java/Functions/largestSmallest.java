import java.util.Scanner;

public class largestSmallest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your First Number: ");
            int num1 = in.nextInt();
            System.out.print("Enter your Second Number: ");
            int num2 = in.nextInt();
            System.out.print("Enter your third Number: ");
            int num3 = in.nextInt();

            int max = num1;
            if (num2 > max) {

                max = num2;
            }
            if (num3 > max) {

                max = num3;
            }

            System.out.print(" Largest Number is: ");
            System.out.println(max);

            int min = num1;
            if (num2 < min) {

                min = num2;
            }
            if (num3 < min) {

                min = num3;
            }

            System.out.print("And Smallest Number is: ");
            System.out.println(min);
        }

    }
}
