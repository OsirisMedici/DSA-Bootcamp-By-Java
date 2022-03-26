import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(
                    "Enter a Number you want to find out Even or Odd: ");
            int inp = in.nextInt();

            if (inp % 2 == 0) {
                System.out.print(
                        "It's an Even Number ");
            } else {
                System.out.print("It's an Odd Number ");
            }
        }
    }
}
