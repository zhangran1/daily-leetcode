package Easy;

public class Q26RemoveDuplicatesFromSortedArray {
    /*
    Method two pointer
    Time Complexity: O(n), need to loop through all numbers
    Space Complexity: O(1), only introduce two variables to keep track the index
    * */
    public int removeDuplicates(int[] nums) {
        int slowCounter = 0;

        for(int fastCounter = 1; fastCounter < nums.length; fastCounter++) {
            if(nums[fastCounter] != nums[slowCounter]) {
                slowCounter++;
                nums[slowCounter] = nums[fastCounter];
            }
        }

        return slowCounter + 1;
    }
}
