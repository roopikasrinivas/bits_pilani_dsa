package searching;

import util.PrintArray;

import java.util.Arrays;

public class BinarySearch {

    public static boolean binarySearch(int[] A, int key){
        int low=0, high = A.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(A[mid] == key){
                return true;
            }else if(A[mid] > key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {4,5,3,9,1,12};
        int key = 5;
        Arrays.sort(A);
        System.out.println("Input array is");
        PrintArray.printArray(A);
        System.out.println("Key to be found is: "+ key);
        if(binarySearch(A, key)){
            System.out.println("Result after search : key "+key+" found");
        }else{
            System.out.println("Result after search : key "+key+" not found");
        }
    }
}
