package Binery;

import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int row = in.nextInt();
            int col = in.nextInt();

            int[][] numbers = new int[row][col];

            // row
            for (int i = 0; i < row; i++) {
                // for Coloum
                for (int j = 0; j < col; j++) {
                    numbers[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                // for Coloum
                for (int j = 0; j < col; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();

            }
        }

    }
}
