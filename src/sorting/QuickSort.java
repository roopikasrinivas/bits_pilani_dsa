package sorting;

import util.PrintArray;
import util.ArrayElements;

public class QuickSort {

    public static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(A, left, right);
            quickSort(A, left, pivotIndex - 1);
            quickSort(A, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] A, int left, int right) {
        int pivotIndex = left;
        int pivot = A[right];
        System.out.println("Pivot: "+ pivot);
        for (int i = left; i < right; i++) {
            if (A[i] < pivot) {
                ArrayElements.swap(A, pivotIndex, i);
                pivotIndex++;
            }
        }
        ArrayElements.swap(A, pivotIndex, right);
        PrintArray.printArray(A);
        return pivotIndex;
    }

    public static void main(String[] args) {
        int[] A = {86, 25, 72, 44, 13, 31, 99, 57};
        System.out.println("Array before quick sort");
        PrintArray.printArray(A);
        quickSort(A, 0, A.length - 1);
        System.out.println("\nArray after quick sort");
        PrintArray.printArray(A);
    }
}
