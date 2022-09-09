import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hw_1 {

    /**
     * создание массива с негативным размером, превышение макисмального значение типа int.
     * @return
     */
//    private static int[] exception_1() {
//        int a = 1000;
//        return new int[a*a*a*a];
//    }

    /**
     * индекс выходит из границ ArrayList.
     * @return
     */
//    private static int exception_2() {
//        ArrayList<Integer> arr = new ArrayList<>();
//        return arr.get(2);
//    }

    /**
     * Недопустимый аргумент.
     * @return
     */
    public static int exception_3(){
        ArrayList<Integer> input = new ArrayList<>();
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(input.size());
    }


    public static void main(String[] args) {
//        System.out.print(exception_1());
//        System.out.print(exception_2());
        System.out.print(exception_3());
    }
}
