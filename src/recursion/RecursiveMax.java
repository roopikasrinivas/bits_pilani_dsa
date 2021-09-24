package recursion;

public class RecursiveMax {

    public static int recursiveMax(int[] A, int n){
        if(n==1) return A[0];
        return Math.max(recursiveMax(A, n-1), A[n-1]);
    }

    public static int iterativeMax(int[] A, int n){
        int currentMax = A[0];
        for(int i=1; i<n; i++){
            if(currentMax < A[i]){
                currentMax = A[i];
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        int[] A = {20,30,70,10,90,45};
        System.out.println("Max element by Recursion approach is: "+ recursiveMax(A, A.length));
        System.out.println("Max element by Iterative approach is: "+ iterativeMax(A, A.length));
    }
}
