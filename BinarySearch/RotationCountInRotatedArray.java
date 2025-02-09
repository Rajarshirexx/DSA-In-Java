package BinarySearch;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use for non-duplicates
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

    // use for duplicates
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
