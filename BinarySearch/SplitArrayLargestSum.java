package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int ans = splitArray(nums, 2);
        System.out.println(ans);
    }
    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop it will conatin the max item
            end += nums[i];
        }

        // binary search
        while(start < end) {
            // try mid for potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //you cant add this is new subarray, make new 
                    //say you can add this num in new sybarray, then sum = num
                    sum = num;
                    pieces++;

                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end; // here start = end
    }
}
