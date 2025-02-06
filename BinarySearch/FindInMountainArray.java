package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 9, 5, 3, 1};
        int ans = search(arr, 3);
        System.out.println("Index is: " + ans);
    }

    static int search(int[] arr, int target) {
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // search in second half
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; // Descending part
            } else {
                start = mid + 1; // Ascending part
            }
        }
        return start; // Peak index
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
