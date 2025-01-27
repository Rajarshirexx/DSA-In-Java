
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Is the number prime? " + isPrime(n));

        System.out.println("Three-digit Armstrong numbers are:");
        printThreeDigitArmstrongNumbers();
    }

    // print all three digit armostrong numbers

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem; // Cube of each digit
            n /= 10;
        }

        return sum == original;
    }

    static void printThreeDigitArmstrongNumbers() {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
