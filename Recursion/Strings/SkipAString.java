package Recursion.Strings;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skipString("pineapple"));
    }

    static String skipString(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")){
            return skipString(up.substring(5));
        } else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
    
}
