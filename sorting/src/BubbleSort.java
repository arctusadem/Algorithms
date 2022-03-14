public class BubbleSort {

    static void bubbleSort(int[] array) {
        int i = 0;
        int j = array.length-1;
        int x;

        for (; i < array.length; i++) {
            for (; j > i; j--){
                if (array[j] < array[j-1]) {
                    x = array[j-1];
                    array[j-1] = array[j];
                    array[j] = x;
                }
            }
            j = array.length-1;
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 2, 7, 6, 15, 14, 1, 3, 13, 18, 8, 10, 20, 7, 4, 11, 19, 17 };

        bubbleSort(array);

        for (int a: array) {
            System.out.println(a);
        }

    }

}
