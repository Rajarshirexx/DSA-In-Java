// Order agnostic binary search is called for when we dont know if the array is in ascending or descending order

package BinarySearch;

public class AgnosticBinary {
    public static void main(String[] args) {
        
        // ascending
        int[] arr = {-18, -12, -4, 0, 4, 8, 9, 17, 19, 32}; // ascending
        int target = 8;

        // descending
        /* int[] arr ={90, 75, 64, 51, 35, 17, 0, -5, -9};
        int target = 51; */
        
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // find whether the array is ascending or descending

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; 
            // might be possible that (start + end) exceeds range of integer in java          
            
            int mid = start + (end - start) /2;

            if(arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } 
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }  
}
