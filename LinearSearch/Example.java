package LinearSearch;

public class Example {
    public static void main(String[] args) {
        int [] nums = {23, 67, 87, 45, 90, 79};
        int ans = LinearSearch(nums, 67);
        System.out.println("Element at index: " + ans);
    }

    // searching array and return index if found
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } 

        for (int index = 0; index < arr.length; index++) {
            // check for element in every index
            if (arr[index] == target) {
                return index;
            }
        }

        return -1; // if not found
    }
}
    

