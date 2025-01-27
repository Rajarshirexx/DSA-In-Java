// take array input and print using for loop

package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        int[] arr = new int[5];
        
        for(int i =0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // enhanced for loop i.e, for every element in array, print the element
        for (int num : arr) { 
            System.out.print(num + " ");
        }

        // inout string
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        
    }
}
