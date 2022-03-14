public class BinarySearch {

    public static void binarySearch(int[] array, int x, int floor, int ceiling) {

        if ( ceiling >= floor) {
            int aux = floor + (ceiling - floor) / 2;

            if (x == array[aux])
                System.out.println("Value found at position: " + aux);
            else if (x < array[aux])
                binarySearch(array, x, floor, aux-1);
            else if (x > array[aux])
                binarySearch(array, x, aux+1, ceiling);
        } else
            System.out.println("Value not found");
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 2, 7, 6, 15, 14, 1, 3, 13, 18, 8, 10, 20, 7, 4, 11, 19, 17 };

        InsertionSort.insertionSort(array);

        binarySearch(array, 13, 0, array.length);
    }

}
