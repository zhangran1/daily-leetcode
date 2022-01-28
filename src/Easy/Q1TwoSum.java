package Easy;

import java.util.HashMap;

public class Q1TwoSum {
    //time complexity: O(n), loop through all the elements
    //space complexity: O(n), extra space is required to store key value pair
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int diff = target - nums[index];
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), index};
            }
            map.put(nums[index], index);
        }

        return null;
    }
}
