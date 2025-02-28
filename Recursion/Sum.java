package Recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = add(6);
        System.out.println("The sum is: " + ans);
    }

    static int add(int n) {
        if (n == 0) {
            return 0;
        }

        return n + add(n - 1);
    }
}
