public class InsertionSort {

    static void insertionSort(int[] array) {
        int i = 1;
        int j, x;

        for (; i < array.length; i++) {
            x = array[i];
            j = i;
            for (; j > 0 && array[j - 1] > x; j--) {
                array[j] = array[j - 1];
            }
            array[j] = x;
        }
    }
        public static void main(String[] args) {
            int[] array = { 5, 9, 2, 7, 6, 15, 14, 1, 3, 13, 18, 8, 10, 20, 7, 4, 11, 19, 17 };

            insertionSort(array);

            for (int a: array) {
                System.out.println(a);
            }

    }

}
