package sorting;

import util.PrintArray;

//O(n) + O(R) + O(n + R) = O(n+R) = O(max(n,R))
public class CountSort {

    public static void countSort(int[] A, int n, int R){
        //Initialize frequency array with 0's.
        int[] frequencyArray = new int[R];
        for(int i=0; i<R; i++){
            frequencyArray[i] = 0;
        }

        //Scan input array and increase the count of corresponding element in frequency array
        for(int i=0; i<n; i++){
            int index = A[i];
            frequencyArray[index] = frequencyArray[index] + 1;
        }

        //Print frequency Array
        PrintArray.printArray(frequencyArray);

        // Scan the frequency array and copy items to sorted array
        int[] sortedArray = new int[n];
        int k=0;
        for(int i=0; i<R; i++){
            int frequency = frequencyArray[i];
            for(int j=1; j<=frequency; j++){
                sortedArray[k++] = i;
            }
        }

        //Copy sorted array to actual array
        System.arraycopy(sortedArray, 0, A, 0, n);
    }

    public static void main(String[] args) {
        int[] A = {6,1,8,3,7,2,3,9,7};
        System.out.println("Array before count sort");
        PrintArray.printArray(A);
        countSort(A, A.length, 10);
        System.out.println("\nArray after count sort");
        PrintArray.printArray(A);
    }
}
