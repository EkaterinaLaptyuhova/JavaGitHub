import java.util.Locale;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputText = input.nextLine();


        System.out.println("The lenght of the string: " + inputText.length());
        System.out.println("The string is in Upper Case: " + inputText.toUpperCase());
        System.out.println("The string is in Lower Case: " + inputText.toLowerCase());

        String searchWord = "Assesment";
        boolean isContain = inputText.toLowerCase().contains(searchWord.toLowerCase());
        System.out.println("The string contains substring " + searchWord + ": " + isContain);
    }
}
