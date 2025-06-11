import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (Arrays.binarySearch(nums, i + 1) < 0) {
                list.add(i + 1);
            } else {
                System.out.println(i + 1 + " - Такой есть!");
            }
        }
        System.out.println(list);
    }
}


