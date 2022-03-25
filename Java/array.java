import java.util.Arrays;

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
}
