package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Arraylist Elements:");
        ArrayList<Integer> list = new ArrayList<>();
        
        // adding manually
        /* 
        list.add(67);
        list.add(69);
        list.add(57);
        list.add(647);
        list.add(74);
        list.add(672);
        list.add(687);
        list.add(670);
 */
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        /* for (int i = 0; i < 5; i++) {
           System.out.println(list.get(i)); // pass index here
        } */

        System.out.println(list);
    }
}