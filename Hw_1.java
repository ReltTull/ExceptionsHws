import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hw_1 {

    /**
     * создание массива с негативным размером, превышение макисмального значение типа int.
     * @return
     */
    private static int[] exception_1() {
        int a = 1000;
        return new int[a*a*a*a];
    }

    /**
     * индекс выходит из границ ArrayList.
     * @return
     */
    private static int exception_2() {
        ArrayList<Integer> arr = new ArrayList<>();
        return arr.get(2);
    }

    /**
     * Недопустимый аргумент.
     * @return
     */
    private static int exception_3(){
        ArrayList<Integer> input = new ArrayList<>();
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(input.size());
    }


    private static int[] ex_3(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays lengths is not equals");
        }
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }

    private static double[] ex_4(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays lengths is not equals");
        }
        double[] res = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = (double) arr1[i] / (double) arr2[i];
        }
        return res;

    }


    public static void main(String[] args) {

//        System.out.print(exception_1());
//        System.out.print(exception_2());
//        System.out.print(exception_3());

        int[] arr1 = {5, 4, 2, 10};
        int[] arr2 = {2, 1, 2, 9};

//        int[] res = ex_3(arr1, arr2);
        double[] res = ex_4(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
