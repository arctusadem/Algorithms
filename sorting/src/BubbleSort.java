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

        for (int a: array) {
            System.out.println(a);
        }
    }

}
