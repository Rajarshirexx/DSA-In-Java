package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = product(134);
        System.out.println("The product is: " + ans);
        
    }

    static int product(int n) {
        // this because any digit multiplied by 0 returns 0, hence for the last digit it will return the last digit.

        if (n%10 == n) { 
            return n;
        }

        return (n%10) * product(n/10);
    }
}
