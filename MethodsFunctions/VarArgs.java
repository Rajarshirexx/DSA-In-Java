
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 5, 7, 9, 10);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
