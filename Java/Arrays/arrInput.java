import java.util.Scanner;

public class arrInput {
    public static void main(String[] args) {
        System.out.println(
                "Enter a Number: ");

        try (Scanner in = new Scanner(System.in)) {
            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                System.out.println(arr[i] + " ");
            }
        }
    }
}