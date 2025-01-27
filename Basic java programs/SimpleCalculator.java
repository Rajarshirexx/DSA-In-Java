
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firt number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator: +, -, *, / : ");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
        case '+':
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        break;

        case '-':
        int dif = a - b;
        System.out.println("The difference is: " + dif);
        break;

        case '*':
        int mul = a * b;
        System.out.println("The product is: " + mul);
        break;

        case '/':
        int div = a / b;
        System.out.println("The division is: " + div);
        break;

        default:
        System.out.println("invalid");
    }
}
}
