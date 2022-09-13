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

    public static void main(String[] args) {
//        System.out.println(ex_1());


//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        int d = 2;
        double[] doubles = {1, 4, 2, 6, 2, 4, 1, 5, 43, 43, 3};
        double catchedRes1 = doubles[8] / d;
        if (d == 0) {
            System.out.println("Arithmetical exception: / by zero");
        } else {
            System.out.println("catchedRes1 = " + catchedRes1);
        }


    }
}
