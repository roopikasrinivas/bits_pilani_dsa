package sorting;

import util.PrintArray;
import util.ArrayElements;

public class SelectionSortOptimized {

    public static void selectionSortOptimized(int[] A){
        int n = A.length;
        for(int i=1; i<n; i++){
            int inversions = 0;
            for(int j=0; j<=n-i-1; j++){
                if(A[j] > A[j+1]){
                    inversions++;
                }
            }
            if(inversions == 0) break;
            int currentMaxIndex = 0;
            for(int j=1; j<=n-i; j++){
                if(A[j] > A[currentMaxIndex]){
                    currentMaxIndex = j;
                }
            }
            ArrayElements.swap(A, n-i, currentMaxIndex);
            System.out.println("Array after pass " + i);
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {7,5,4,3,2,1};
        System.out.println("Array before optimized selection sort");
        PrintArray.printArray(A);
        selectionSortOptimized(A);
        System.out.println("\nArray after optimized selection sort");
        PrintArray.printArray(A);
    }
}
