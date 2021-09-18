package searching;

import util.PrintArray;

public class LinearSearch {

    public static boolean linearSearch(int[] A, int key){
        for(int i : A){
            if(i == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {4,5,3,9,1,12};
        int key = 10;
        System.out.println("Input array is");
        PrintArray.printArray(A);
        System.out.println("Key to be found is: "+ key);
        if(linearSearch(A, key)){
            System.out.println("Result after search : key "+key+" found");
        }else{
            System.out.println("Result after search : key "+key+" not found");
        }
    }
}
