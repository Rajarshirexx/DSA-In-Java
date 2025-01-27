package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7 ,3, 14, 28};
        int target = 3;
        int ans = LinearSearch(arr, target, 1, 4);
        System.out.println(ans);

    }
    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        } 

        for (int index = start; index <= end; index++) {
            // check for element in every index
            if (arr[index] == target) {
                return index;
            }
        }

        return -1; // if not found
    }
}
