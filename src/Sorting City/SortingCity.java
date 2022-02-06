import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortingCity {
    public static void selectionSort(int[] arr){
        //Selection Sort
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" -> ");
        }
    }

    public static void insertionSort(int[] data){
        // Insertion Sort
        for (int i = 1; i < data.length; ++i) {
            int key = data[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        for(int i=0; i<data.length;i++){
            System.out.print(data[i]+" -> ");
        }
    }

    public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] data, int l, int r){
        if(l < r){
            int mid = l + (r-l)/2;

            mergeSort(data,l, mid);
            mergeSort(data, mid+1, r);

            merge(data, l, mid, r);
        }
    }

    public static void main(String[] args){
        for(int CAPACITY = 10; CAPACITY < 100000000 ; CAPACITY*=10){
            System.out.println("\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Unsorted Array Length : " + CAPACITY);
            int[] data = new int[CAPACITY];
            Random r1 = new Random();
            for(int i = 0 ; i < CAPACITY ; i++){
                data[i] = r1.nextInt(100) + 1;
                System.out.print(data[i] + " -> ");
            }
            int [] d1 = Arrays.copyOfRange(data,0,CAPACITY-1);
            int [] d2 = Arrays.copyOfRange(data,0,CAPACITY-1);
            int [] d3 = Arrays.copyOfRange(data,0,CAPACITY-1);

            // Selection Sort
            System.out.print("\n\nAfter Selection Sort ::::: ");
            long start = System.currentTimeMillis();
            selectionSort(d1);
            long end = System.currentTimeMillis();
            long elapsed_selection = end - start;
            System.out.println("\n\t\t\t\t\t ::::: Time (Selection): "+elapsed_selection+" ms");

            // Insertion Sort
            System.out.print("After Insertion Sort ::::: ");
            start = System.currentTimeMillis();
            insertionSort(d2);
            end = System.currentTimeMillis();
            long elapsed_insertion = end - start;
            System.out.println("\n\t\t\t\t\t ::::: Time (Insertion): "+elapsed_insertion+" ms");

            // Merge Sort
            System.out.print("After Merge     Sort ::::: ");
            start = System.currentTimeMillis();
            mergeSort(d3,0,d3.length-1);
            for(int i=0; i<d3.length;i++){
                System.out.print(d3[i]+" -> ");
            }
            end = System.currentTimeMillis();
            long elapsed_merge = end - start;
            System.out.println("\n\t\t\t\t\t ::::: Time (Merge): "+elapsed_merge+" ms");
        }
    }
}
