/* Q. Given a character array "letters" that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than the target.

Ex:

Input: letters = {"c", "f", "j"}, target = "a"
Output: "c" 

NOTE: The letters wrap around.

For ex: if  target == 'z' and letters == {'a' , 'b'}, the answer is 'a'.

*/

//Solution:

package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = search(letters, target);
        System.out.println(ans);
        
    }
    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return letters[start % letters.length];
    
    }
}
