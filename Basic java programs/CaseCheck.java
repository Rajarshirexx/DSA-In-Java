import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().trim().charAt(0);
        
        if (ch >= 'a' && ch <= 'z' ) {
            System.out.println("Lowercase");

        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }

    }
}
