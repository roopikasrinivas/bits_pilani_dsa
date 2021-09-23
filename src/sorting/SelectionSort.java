package sorting;

import util.PrintArray;
import util.ArrayElements;

public class SelectionSort {

    public static void selectionSort(int[] A){
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

    public static void main(String[] args) {
        int[] A = {7,5,4,3,2,1};
        System.out.println("Array before selection sort");
        PrintArray.printArray(A);
        selectionSort(A);
        System.out.println("\nArray after selection sort");
        PrintArray.printArray(A);
    }
}
