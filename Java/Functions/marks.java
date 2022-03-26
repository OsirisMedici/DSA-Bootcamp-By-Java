import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int marks = in.nextInt();

            if (marks >= 91) {
                System.out.println("YOu are AA student! well done");
            } else {
                System.out.println(
                        "You got AB ");
            }
        }
    }
}
