package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 12, 16};
        int target = 7;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr,int target, int s, int e){
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        
        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        }
  
        return search(arr, target, mid + 1, e);
        
    }
}
