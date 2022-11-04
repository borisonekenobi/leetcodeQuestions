class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < sums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            sums[i] = sum;
        }
        return sums;
    }
}