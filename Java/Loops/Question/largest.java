package Question;

import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        System.out.println("Enter three Numbers : ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            // We have to find the largest number among these 3 ----->

            int max = a;
            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            System.out.println(max);
        }
    }
}
