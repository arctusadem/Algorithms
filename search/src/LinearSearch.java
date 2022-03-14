public class LinearSearch {

    public static void linearSearch(int[] array, int x) {

         for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Value found at position: " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 9, 2, 7, 6, 15, 14, 1, 3, 13, 18, 8, 10, 20, 7, 4, 11, 19, 17 };

        linearSearch(array, 8);
    }
}
