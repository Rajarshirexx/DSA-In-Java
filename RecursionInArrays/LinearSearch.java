package RecursionInArrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 5, 8, 7, 9, 12};
        ArrayList<Integer> result = findAllIndex(arr, 5, 0, new ArrayList<>());
        System.out.println(result); 
    }   
  
    // Return for a single index
    static int search(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }

    // Return multiple indices (Better way)
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}
