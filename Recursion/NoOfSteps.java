/* Q. Given an integer num, return the steps to desuce it tozero.abstract 

In one step, if the current number is even you have to divide by 2, otherwise, you have to subtract 1 from it. */

package Recursion;

public class NoOfSteps {
    public static void main(String[] args) {
        int ans = count(12);
        System.out.println("The number of steps is: " + ans);
    }

    static int count(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }

        return helper(num - 1, steps+1);
    }
}
