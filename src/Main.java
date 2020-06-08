import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();

        int[] test = {5,9,8,1,2,3,6,7,4};
        System.out.println("Array før sortering: " + Arrays.toString(test));

        heapSort.sort(test);
        System.out.println("Array efter 'heap sort': " + Arrays.toString(test));

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Collections.shuffle(Arrays.asList(array));

        double startTid = System.nanoTime();
        heapSort.sort(array);
        double slutTid = System.nanoTime();
        System.out.println("'Heap sort' på array med 10000 indexes tog: " + (slutTid - startTid)/1000000000 + " sekunder");


        System.out.println("----------------------------------------------------------------");



        int[] insertionTest = {5,9,8,1,2,3,6,7,4};
        System.out.println("Array før sortering: " + Arrays.toString(insertionTest));

        mergeSort.sort(test, 0, test.length-1);
        System.out.println("Array efter 'merge sort': " + Arrays.toString(test));

        Collections.shuffle(Arrays.asList(array));

        double startTid1 = System.nanoTime();
        mergeSort.sort(test, 0, test.length-1);
        double slutTid1 = System.nanoTime();
        System.out.println("'Merge sort' på array med 10000 indexes tog: " + (slutTid1 - startTid1)/1000000 + " sekunder");


    }
}
