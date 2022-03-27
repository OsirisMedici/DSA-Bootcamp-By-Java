import java.util.Arrays;

public class userArrays {
    public static void main(String[] args) {
        System.out.println("ENter your 4 Favourite numbers: ");
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

            System.out.println(arr[i]);

        }

        int[] sum = { 12, 34, 56, 78 };

        System.out.println(Arrays.toString(sum));
        // for (int i = 0; i < arr.length; i++) {

        // }
    }
}
