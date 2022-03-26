import java.util.Scanner;

public class young {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(
                    "Enter a Number you want to find out Even or Odd: ");
            int inp = in.nextInt();

            if (inp >= 18) {
                System.out.print(
                        " You are eligible to vote ");
            } else {
                System.out.print(" Growwww up kid!! ");
            }
        }
    }
}
