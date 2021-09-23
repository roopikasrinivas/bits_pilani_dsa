package sorting;

import util.PrintArray;

public class InsertionSortOptimized {

//    Worst case complexity = O(n^2) Best case complexity = O(n)
    public static void insertionSortOptimised(int[] A) {
        int n = A.length;
        int i, k, j, key;
        for (i = 1; i < n; i++) {
            int inversions = 0;
            for (j = 0; j < n-1; j++) {
                if (A[j] > A[j+1])
                    inversions++;
            }
            if (inversions == 0) break;

            key = A[i];
            j = i - 1;

            System.out.println("Pass:" +i);
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
                PrintArray.printArray(A);
            }
            A[j + 1] = key;
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 9, 4, 1, 8, 6};
        System.out.println("Array before optim insertion sort");
        PrintArray.printArray(A);
        insertionSortOptimised(A);
        System.out.println("\nArray after optim insertion sort");
        PrintArray.printArray(A);
    }
}
