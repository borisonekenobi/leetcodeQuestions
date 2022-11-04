class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = 1
        maxLoop = len(nums) - 1
        while (length <= maxLoop):
            if nums[length] != nums[length - 1]:
                length+=1
            else:
                nums.pop(length)
                maxLoop-=1