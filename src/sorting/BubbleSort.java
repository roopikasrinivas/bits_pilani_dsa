package sorting;

import util.PrintArray;
import util.SwapArray;

public class BubbleSort {

    public static void bubbleSort(int[] A){
        int n = A.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(A[j] > A[j+1]){
                    SwapArray.swap(A, j, j+1);
                }
            }

            System.out.println("Array after pass " + i);
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {7,5,4,3,2,1};
        System.out.println("Array before bubble sort");
        PrintArray.printArray(A);
        bubbleSort(A);
        System.out.println("\nArray after bubble sort");
        PrintArray.printArray(A);
    }
}
