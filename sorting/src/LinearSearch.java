public class LinearSearch {

    public static void linearSearch(int[] array, int x) {

         for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Value found at position: " + i);
                break;
            }
        }
    }
}
