import java.util.LinkedList;

public class Sem_1 {
    private static boolean checkNullValues (Integer[] array) {
        LinkedList<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                indexes.add(i);
            }
        }
        if (!indexes.isEmpty()) {
            throw new RuntimeException("indexes of null elements: " + indexes);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(checkNullValues(new Integer[] {1, 3, 2, 5, null, null, 27, 42}));
    }
}
