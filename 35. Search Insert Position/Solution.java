class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) {
            if (nums[0] >= target) return 0;
            else return 1;
        }

        int index = (int) nums.length / 2 - 1;
        if (nums[index] > target) return searchInsert(Arrays.copyOfRange(nums, 0, index), target);
        else if (nums[index] == target) return index;
        else return searchInsert(Arrays.copyOfRange(nums, index + 1, nums.length), target) + index + 1;
    }
}