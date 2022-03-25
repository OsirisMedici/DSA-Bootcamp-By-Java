package Loops.Question;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter a Number  you want to reverse: ");
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            int count = 0;

            while (num > 0) {
                int rem = num % 10;
                num = num / 10;
                count = count * 10 + rem;
            }
            System.out.print("Your reverse number is: ");
            System.out.println(count);
        }

    }
}
