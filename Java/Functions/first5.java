import java.util.Scanner;

public class first5 {
    public static void main(String[] args) {
        System.out.print("ENter a NUmber Bitxh: ");
        try (Scanner in = new Scanner(System.in)) {
            int input = in.nextInt();

            int sum = 0;

            for (int i = 0; i <= input; i++) {
                sum = sum + i;
            }
            System.out.println("Total sum is: " + sum);

        }
    }
}
