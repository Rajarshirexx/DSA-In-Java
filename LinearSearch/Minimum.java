package LinearSearch;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {23, 67, -45, 90, 12, 56};
        int ans = min(arr);
        System.out.println("Minimum in the array is: " + ans);
    }
    
    static int min(int[] arr) {
        int min = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
