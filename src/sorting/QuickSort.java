package sorting;

import util.PrintArray;
import util.SwapArray;

public class QuickSort {

    private static void quickSort(int[] A, int left, int right){
        if(left < right){
            int pivotIndex = partition(A, left, right);
            quickSort(A, left, pivotIndex-1);
            quickSort(A, pivotIndex+1, right);
        }
    }

    private static int partition(int[] A, int left, int right){
       int pivotIndex = left;
       int pivot = A[right];
       for(int i=left; i<right; i++){
           if(A[i] < pivot){
               SwapArray.swap(A, pivotIndex, i);
               pivotIndex++;
           }
       }
       SwapArray.swap(A, pivotIndex, right);
       return pivotIndex;
    }

    public static void main(String[] args) {
        int[] A = {85,24,63,45,17,31,96,50,5};
        System.out.println("Array before quick sort");
        PrintArray.printArray(A);
        quickSort(A, 0, A.length-1);
        System.out.println("\nArray after quick sort");
        PrintArray.printArray(A);
    }
}
