package start;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("We have four numbers : ");
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 10;

        marks[2] = 20;
        System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks);

        System.out.println(marks[0]);

    }

    public static void sum() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(
                    "Enter number 1: ");
            int num1 = in.nextInt();

            System.out.print(
                    "Enter number 2: ");
            int num2 = in.nextInt();

            int sum = num1 + num2;

            System.out.print("The Sum is : ");
            System.out.print(sum);
        }
    }
}
