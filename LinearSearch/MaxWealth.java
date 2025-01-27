package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                 sum += accounts[person][account];
            }

            // now we have sum of account of person
            // check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }    
}
