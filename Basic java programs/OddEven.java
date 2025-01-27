import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int number = sc.nextInt();
        int check = number % 2;
        if (check == 0 )
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }

    }
}
