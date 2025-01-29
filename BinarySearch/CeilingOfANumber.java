/* Q. Find the Ceiling of a Number for a Target Element.

The ceiling of a number in an array is defined as the smallest element in the array that is greater than or equal to the target element.

Example:
Given an array:

{2, 6, 8, 14, 16, 18, 20}

1. If the target is 14, then the ceiling is 14 itself because 14 exists in the array and equal to itself.

2. If the target is 15, then the ceiling is 16, as 16 is the smallest element greater than 15 (and 15 is not present in the array). */

//Solution:

package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {-7,-5 ,-3 ,3, 5, 9, 12, 15, 21, 30, 37, 45};
        int target = 16;
        int ans = Ceiling(arr, target);
        System.out.println("The ceiling is at index: " + ans );
    }
    
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
