public class Swap {
    public static void main(String[] args) {
        int[] numbers = {10, 20}; // Use an array to hold a and b

        swap(numbers); // Pass the array to the swap method
        System.out.println("a is " + numbers[0] + " and b is " + numbers[1]);
    }

    static void swap(int[] nums) {
        int temp = nums[0]; // Swap the values using the array
        nums[0] = nums[1];
        nums[1] = temp;
    }
}
