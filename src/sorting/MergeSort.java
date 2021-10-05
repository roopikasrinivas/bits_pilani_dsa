package sorting;

import util.PrintArray;

public class MergeSort {
    private static int numberOfMerges = 0;

    public static void mergeSort(int[] A, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int mid, int right) {
        numberOfMerges++;
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = A[i++];
        }
        while (j <= right) {
            temp[k++] = A[j++];
        }
        System.arraycopy(temp, 0, A, left, temp.length);
    }

    public static void main(String[] args) {
        int[] A = {86, 25, 72, 44, 13, 31, 99, 57};
        System.out.println("Array before merge sort");
        PrintArray.printArray(A);
        mergeSort(A, 0, A.length - 1);
        System.out.println("\nArray after merge sort");
        PrintArray.printArray(A);
        System.out.println("\nNumber of Merges: " + numberOfMerges);
        System.out.println("Number of levels: " + (numberOfMerges / 2));
    }
}
