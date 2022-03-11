
public class Main {

    public static void main(String[] args) {
        String lb = "\n ----------------------------------------------------------------- \n";
        int[] disorderedArray = { 5, 9, 2, 7, 12, 6, 15, 14, 1, 3, 13, 18, 8, 10, 20, 7, 4, 11, 19, 17 };
        /*
        int length = 100;
        int disorderedArray[] = new int[length];

        for (int i = 0; i < length; i++)
            disorderedArray[i] = (int)Math.round(Math.random() * 100);
        */
        
        for (int a: disorderedArray)
            System.out.println(a);

        System.out.println(lb);

        LinearSearch.linearSearch(disorderedArray, 8);
	    //BubbleSort.bubbleSort(disorderedArray);
        InsertionSort.insertionSort(disorderedArray);
    }
}
