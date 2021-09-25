package searching;

import util.PrintArray;

import java.util.Arrays;

public class BinarySearch {

    public static boolean binarySearch(int[] A, int key){
        int low=0, high = A.length-1;
        int count = 0;
        while(low <= high){
            System.out.print("\nIteration :"+ count);
            int mid = (low + high)/2;
            System.out.print(" Low: "+low+ " High: "+high+ " Mid: "+mid+ " A[mid]: "+A[mid] );
            if(key == A[mid]){
                System.out.println(" Comparision =");
                return true;
            }else if( key < A[mid] ){
                System.out.println(" Comparision <");
                high = mid-1;
            }else{
                System.out.println(" Comparision >");
                low = mid+1;
            }
            count++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {11, 17, 23, 29, 31, 43, 46, 55, 69, 72, 78, 82,93, 97};
        int key = 17;
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
