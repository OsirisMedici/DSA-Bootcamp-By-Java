package Loops.Question;

// import java.util.Scanner;

public class remender {
    public static void main(String[] args) {
        // System.out.print("Enter a number you want to see how many 5 are there: ");
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();

        int num = 234555567;

        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;

        }
        System.out.println(count);

    }
}
