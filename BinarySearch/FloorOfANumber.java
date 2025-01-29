/* Q. Find the Floor of a Number for a Target Element.

The ceiling of a number in an array is defined as the greatest element in the array that is smaller than or equal to the target element.

Example:
Given an array:

{2, 6, 8, 14, 16, 18, 20}

1. If the target is 14, then the ceiling is 14 itself because 14 exists in the array and equal to itself.

2. If the target is 15, then the ceiling is 14, as 14 is the greatest element smaller than 15 (and 15 is not present in the array). */

//Solution

package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {-7, -5 ,-3 ,3, 5, 9, 12, 15, 21, 30, 37, 45};
        int target = -4;
        int ans = Floor(arr, target);
        if (ans == -1) {
            System.out.println("No floor found for target " + target);
        } else {
            System.out.println("The floor is at index: " + ans + " (value: " + arr[ans] + ")");
        }
    }
    
    
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (target < arr[start]) {
                return -1; // No floor exists
            }
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }
        
        return end; // The floor of the target is at 'end'
    }
}
