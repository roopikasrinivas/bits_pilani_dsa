package sorting;

public class BubbleSort {

    public static void bubbleSort(int[] A){
        int n = A.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(A[j] > A[j+1]){
                    swap(A, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void printArray(int[] A){
        for(int a : A){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int[] A = {7,5,4,3,2,1};
        System.out.println("Array before bubble sort");
        printArray(A);
        bubbleSort(A);
        System.out.println("\nArray after bubble sort");
        printArray(A);
    }
}
