import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int enteredInt = input.nextInt();
        int sum = 0;

        negativeSum:
        if (enteredInt < 0){
            for (int i = 0; i >= enteredInt; i -- ){
               try {
                   sum = Math.addExact(sum, i);
               } catch (ArithmeticException e) {
                   System.out.println("The sum of all numbers more than int");
                   System.out.println("The last sum is " + sum);
                   break negativeSum;
               }
            }
            System.out.println("Sum of the numbers from 0 to " + enteredInt + " = " + sum);
        }

        positiveSum:
        if (enteredInt > 0){
            for (int i = 0; i <= enteredInt; i++){
                try {
                    sum = Math.addExact(sum, i);
                } catch (ArithmeticException e){
                    System.out.println("The sum of all numbers more than int");
                    System.out.println("The last sum is " + sum);
                    break positiveSum;
                }
            }
            System.out.println("Sum of the numbers from 0 to " + enteredInt + " = " + sum);
        }if (enteredInt == 0){

            System.out.println("The sum = 0");
        }
    }
}
