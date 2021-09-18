package sorting;

import util.PrintArray;
import util.SwapArray;

public class BubbleSortOptimized {

    public static void bubbleSortOptimized(int[] A){
        int n = A.length;
        for(int i=1; i<n; i++){
            int swaps = 0;
            for(int j=0; j<n-1; j++){
                if(A[j] > A[j+1]){
                    SwapArray.swap(A, j, j+1);
                    swaps++;
                }
            }
            System.out.println("\nArray after pass " + i);
            PrintArray.printArray(A);
            System.out.println("Number of swaps : "+ swaps);
            if(swaps == 0) break;
        }
    }

    public static void main(String[] args) {
        int[] A = {4,5,3,9,1,12};
        System.out.println("Array before bubble sort");
        PrintArray.printArray(A);
        bubbleSortOptimized(A);
        System.out.println("\nArray after bubble sort");
        PrintArray.printArray(A);
    }
}
