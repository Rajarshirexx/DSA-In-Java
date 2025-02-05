package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        // Check for first and last occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }

    // This function returns the index value of target
    private static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Look on the left side for first occurrence
                } else {
                    start = mid + 1; // Look on the right side for last occurrence
                }
            }
        }
        return ans;
    }
}
