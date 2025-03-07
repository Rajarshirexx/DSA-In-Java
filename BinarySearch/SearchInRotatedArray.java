package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = search(nums, 6);
        System.out.println("The ans is: " + ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If there is no pivot, the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the pivot is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Decide which side to search
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot is mid
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case 2: Pivot is mid-1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Adjust search range
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found (array is not rotated)
    }

    static int findPivotForDuplicateValues(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
    
            // If elements at start, mid, and end are equal, skip duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Skip duplicates at start
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
    
                // Skip duplicates at end
                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, pivot in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // Right side is sorted, pivot in the left
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found
    }
    
}
