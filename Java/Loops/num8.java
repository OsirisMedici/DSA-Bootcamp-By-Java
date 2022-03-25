package Loops;

import java.util.Scanner;

public class num8 {

    public static void main(String[] args) {
        System.out.println(
                "Enter a Number ---> how many times you want to print Hentai: ");
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            for (int i = 0; i <= n; i++) {
                System.out.println("Hentai bantai 5" + i);
            }
        }
    }
}
