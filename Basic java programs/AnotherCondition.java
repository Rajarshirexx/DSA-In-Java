import java.util.*;
public class AnotherCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        int number = n;
        while(number>0){
            int rem = number % 10;
            rev= rev * 10 + rem;
            number = number/10;
        }
        System.out.println(rev);
    }
}

