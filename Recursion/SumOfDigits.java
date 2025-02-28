package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(63248);
        System.out.println("The sum of digits are: " + ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n%10) + sum(n/10);
    }
}
