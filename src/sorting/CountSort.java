package sorting;

import util.PrintArray;

//O(n) + O(R) + O(n + R) = O(n+R) = O(max(n,R))
public class CountSort {

    public static void countSort(int[] A, int n, int a, int b){
        //Initialize frequency array with 0's.
        int R= b-a + 1;
        int[] frequencyArray = new int[R];
        for(int i=0; i<R; i++){
            frequencyArray[i] = 0;
        }

        //Scan input array and increase the count of corresponding element in frequency array
        for(int i=0; i<n; i++){
            int index = A[i] - a;
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
                sortedArray[k++] = i + a;
            }
        }

        //Copy sorted array to actual array
        System.arraycopy(sortedArray, 0, A, 0, n);
    }

    public static void main(String[] args) {
        int[] A = {21,18,20,17,18,19,16,19,18,20,21,23,24,23,25};
        System.out.println("Array before count sort");
        PrintArray.printArray(A);
        countSort(A, A.length, 16,25);
        System.out.println("\nArray after count sort");
        PrintArray.printArray(A);
    }
}
