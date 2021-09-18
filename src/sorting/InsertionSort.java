package sorting;

import util.PrintArray;

public class InsertionSort {

    public static void insertionSort(int[] A) {
        int n = A.length;
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = A[i];
            j = i - 1;

        /* Move elements of arr[0..i-1], that are
        greater than key, to one position ahead
        of their current position */
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;

            System.out.println("Array after pass " + i);
            PrintArray.printArray(A);
        }
    }

    public static void insertionSortClass(int[] A) {
        int n = A.length;
        int i, k, j, key;
        for (i = 1; i < n; i++) {
            j = i - 1;
            while (A[i] < A[j]) {
                j--;
                if (j < 0) break;
            }
            key = A[i];
            k = i - 1;
            while (k >= j + 1) {
                A[k + 1] = A[k];
                k--;
            }
            A[j + 1] = key;

            System.out.println("Array after pass " + i);
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {3,9,4,1,8,6};
        System.out.println("Array before insertion sort");
        PrintArray.printArray(A);
        insertionSort(A);
        System.out.println("\nArray after insertion sort");
        PrintArray.printArray(A);
    }
}
