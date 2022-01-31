package Easy;

public class Q27RemoveElement {
    // Method: two pointer
    // Time Complexity O(n) : loop through all elements
    // Space Complexity O(1): only constant variable had been introduced
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for(int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if(nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
