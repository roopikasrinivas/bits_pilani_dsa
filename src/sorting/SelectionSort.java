package sorting;

import util.PrintArray;
import util.ArrayElements;

public class SelectionSort {

    //in each pass, the max element in the current sub-array is chosen for swapping
    public static void selectionSortMax(int[] A){
        int n = A.length;
        for(int i=1; i<n; i++){
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

    //in each pass, the minimum element in the current sub-array is chosen for swapping
    public static void selectionSortMin(int[] A){
        int n = A.length;
        for(int i=0; i<n-1; i++){

            int currentMinIndex = i;
            for(int j=i+1; j<n; j++){
                if(A[j] < A[currentMinIndex]){
                    currentMinIndex = j;
                }
            }
            ArrayElements.swap(A, i, currentMinIndex);
            System.out.println("Array after pass " + i);
            PrintArray.printArray(A);
        }
    }

    public static void main(String[] args) {
        int[] A = {4,3,2,1,7,5};
        System.out.println("Array before selection sort");
        PrintArray.printArray(A);
        selectionSortMin(A);
        System.out.println("\nArray after selection sort");
        PrintArray.printArray(A);
    }
}
