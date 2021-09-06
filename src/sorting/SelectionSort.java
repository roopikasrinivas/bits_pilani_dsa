package sorting;

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
            swap(A, n-i, currentMaxIndex);
        }
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {7,5,4,3,2,1};
        selectionSort(A);
        for(int a : A){
            System.out.println(a);
        }
    }
}
