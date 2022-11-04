class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sumL = 0;
            int sumR = 0;
            for (int j = 0; j < i; j++) {
                sumL += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                sumR += nums[j];
            }
            if (sumL == sumR) return i;
        }
        return -1;
    }
}