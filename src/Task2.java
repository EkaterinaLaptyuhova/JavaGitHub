import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print integer: ");
        int number = input.nextInt();

        System.out.println("Number as double: " + (double) number);

        String numberString = String.valueOf(number);
        String s = "Number as String: \"%s\" ".formatted(numberString);
        System.out.println(s);

        System.out.printf("Number with 2 decimal places: %.2f%n", (double) number);


    }
}
