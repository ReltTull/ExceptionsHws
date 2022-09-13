import java.util.Scanner;

public class Hw_2 {

    private static float ex_1() {
        System.out.print("Enter the float number: ");
        Scanner scanner = new Scanner(System.in);
        float res = 0;
        if (!scanner.hasNextFloat()) {
            System.out.print("Try again, enter the float number: ");
            return ex_1();
        } else {
            res = scanner.nextFloat();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ex_1());

    }
}
