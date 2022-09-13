import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hw_2 {

//    private static float ex_1() {
//        System.out.print("Enter the float number: ");
//        Scanner scanner = new Scanner(System.in);
//        float res = 0;
//        if (!scanner.hasNextFloat()) {
//            System.out.print("Try again, enter the float number: ");
//            return ex_1();
//        } else {
//            res = scanner.nextFloat();
//        }
//        return res;
//    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
//        System.out.println(ex_1());


//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        /**
         * ArithmeticException - unchecked exception, заменил конструкцию try-catch на if-else, в задании не
         * инициализирвоан массив, судя по названию переменной, он состоит из целочисленных элементов. Чтобы
         * значение catchedRes1 было типа double, следует задать intArray как массив double, или привести catchedRes1 к
         * типу double.
         */
//        int d = 2;
//        int[] intArray = {1, 4, 2, 6, 2, 4, 1, 5, 43, 43, 3};
//        double catchedRes1 = (double) intArray[8] / d;
//        if (d == 0) {
//            System.out.println("Arithmetical exception: / by zero");
//        } else {
//            System.out.println("catchedRes1 = " + catchedRes1);
//        }

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException | IndexOutOfBoundsException | ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (Throwable ex) {
            System.out.println("Something is broke...");
        }


    }
}
