public class Task1 {

    public static void main(String[] args){
        int x = 4666;
        long x2 = 200000000123L;
        int x3 = 400023000;
        long x4 = -2300000000L;
        double y = 132345.2;
        double y2 = 0.000045;
        char symbol = '@';
        String text = "Assessment 1";
        boolean flag = false;


        // task 1.1
        int castY = (int) y;
        int resultStep1 = x + castY;
        System.out.println(x + " + " + castY + " = " + resultStep1);

        // task 1.2

        String s = "%s / %d = %s".formatted(x2, resultStep1, (double) x2 / resultStep1);
        System.out.println(s);

        // task 1.3
        System.out.println("ASCII/Unicode код " + symbol + " = " + (int) symbol);

        //task 1.4
        System.out.println(x + " * " + x2 + " = " + (long) x * x2);

        //task 1.5
        System.out.println(x4 + " / " + y + " * " + y2 + " = " + x4 / y * y2);

    }
}
