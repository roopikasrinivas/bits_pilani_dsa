package sorting;

import util.PrintArray;

public class InsertionSort {

    //    Worst case complexity = O(n^2) Best case complexity = O(n)
    public static void insertionSort(int[] A) {
        int n = A.length;
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = A[i];
            j = i - 1;

            System.out.println("Pass:" + i);
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
                PrintArray.printArray(A);
            }
            A[j + 1] = key;
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
            System.out.println("Pass:" + i);
            key = A[i];
            k = i - 1;
            while (k >= j + 1) {
                A[k + 1] = A[k];
                k--;
                PrintArray.printArray(A);
            }
            A[j + 1] = key;
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {31,41,59,26,41,58,};
        System.out.println("Array before insertion sort");
        PrintArray.printArray(A);
        insertionSort(A);
        System.out.println("\nArray after insertion sort");
        PrintArray.printArray(A);
    }
}
