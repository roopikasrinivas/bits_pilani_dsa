package sorting;

import util.PrintArray;

public class InsertionSortOptimized {

    public static void insertionSortOptimised(int[] A) {
        int n = A.length;
        int i, k, j, key;
        for (i = 1; i < n; i++) {
            int inversions = 0;
            for (j = 1; j < n; j++) {
                if (A[j-1] > A[j])
                    inversions++;
            }
            if (inversions == 0) break;

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
        int[] A = {7, 5, 4, 3, 2, 1};
        System.out.println("Array before optim insertion sort");
        PrintArray.printArray(A);
        insertionSortOptimised(A);
        System.out.println("\nArray after optim insertion sort");
        PrintArray.printArray(A);
    }
}
