package LinearSearch;

public class EvenCount {
    public static void main(String[] args) {
        int [] arr = {23, 66, 89, 42, 84, 75};
        int ans = even(arr);
        System.out.println("No of even digits are: " + ans);
        
    }
    static int even(int[] arr) {
        int even = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 == 0) {
                even++;
            }  
        }
        return even;
    }
}
