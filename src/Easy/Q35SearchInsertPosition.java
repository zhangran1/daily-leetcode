package Easy;

public class Q35SearchInsertPosition {
    //Time O(log N) due to binary search
    //Space O(1)
    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        if (nums[leftIndex] > target) {
            return 0;
        }
        if (nums[rightIndex] < target) {
            return rightIndex + 1;
        }

        while(leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (nums[midIndex] == target) {
              return midIndex;
            } else if(nums[midIndex] > target) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }

        return leftIndex;
    }
}
