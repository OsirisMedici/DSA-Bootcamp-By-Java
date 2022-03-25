import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        System.out.println("mango, berry, gavava, apple");
        System.out.println("Enter one of them: ");
        try (Scanner in = new Scanner(System.in)) {
            String fruit = in.next();

            switch (fruit) {
                case "mango":
                    System.out.println("A yellow fruit");
                    break;

                case "apple":
                    System.out.println("A red fruit");
                    break;

                case "gavava":
                    System.out.println("A green fruit");
                    break;

                case "berry":
                    System.out.println("A black fruit");
                    break;
                default:
                    System.out.println("What you want?? A vegetable??");
            }
        }

    }
}
