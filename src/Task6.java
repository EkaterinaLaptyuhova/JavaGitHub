public class Task6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if ((i % 10 != 0) && (i % 3 != 0) && (i % 14 != 0)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        for (int j = 1; j <= 100; j++){
            if ((j % 3 == 0) || (j % 10 == 0) || (j % 14 == 0)){
                continue;
            }
            System.out.print(j + ", ");
        }
    }
}
