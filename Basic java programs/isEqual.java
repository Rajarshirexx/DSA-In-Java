import java.util.*;
public class isEqual 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if (a==b){
            System.err.println("Equals.");
        }
        else if(a > b){
            System.out.println("A is greater.");
        }
        else if(b > a){
            System.out.println("A is lesser.");
    } 
}
}