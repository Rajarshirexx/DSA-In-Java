package Arrays;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr =  {2, 5, 6,7, 9};
        System.out.println(Arrays.toString(arr));
        swap (arr, 0, 3);
        System.out.println("After swapping:");
        System.out.println(Arrays.toString(arr));
    }

    static void swap (int[] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
