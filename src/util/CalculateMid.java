package util;

public class CalculateMid {

    private static void calculateMid(int low, int high){
        int mid = low + (high - low)/ 2;
        System.out.println("Low: "+ low +  "  Mid: "+ mid + "  High: "+ high);
    }
    public static void main(String[] args) {
        calculateMid(0,2);
    }
}
