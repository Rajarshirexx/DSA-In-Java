package BinarySearch;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 11, 6, 4, 1};
        int ans = PeakIndexInMountainArray(arr);
        System.out.println("Peak index: " + ans);
    }

    public static int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part of the array
                end = mid; // mid could be the peak, so we don't do mid - 1
            } else {
                // You are in the ascending part of the array
                start = mid + 1; // because we know mid+1 is greater, so peak must be there
            }
        }
        return start; // or return end, since both will be the peak index
    }
}
