import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer a = ");
        int a = input.nextInt();

        System.out.println("Enter the second integer b = ");
        int b = input.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if (b != 0) {
            System.out.println("a % b = " + (a % b));
        } else
            System.out.println("Division by zero is not allowed");

        if (a > b){
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
            } else
                System.out.println("a = b");

    }
}
