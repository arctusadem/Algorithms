public class InsertionSort {

    static void insertionSort(int[] array) {
        int i = 1;
        int j, x;

        for (; i < array.length; i++) {
            x = array[i];
            j = i;
            for (; j > 0 && array[j-1] > x; j--) {
                    array[j] = array[j-1];
            }
                array[j] = x;
        }

        for (int a: array) {
            System.out.println(a);
        }

    }

}
