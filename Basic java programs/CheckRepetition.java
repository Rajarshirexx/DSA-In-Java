import java.util.*;
public class CheckRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the number you want to check: ");
        int c = sc.nextInt();
        int count = 0;
        int number = n;
        
        while(number > 0){
            int rem = number%10;
            if (rem == c){
                count++;
            }
        number = number / 10;
        }
        System.out.println(count); 
    }
}


    
