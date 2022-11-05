class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        whitespace = [" "]
        symbols = ["-", "+"]
        nums = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

        num = ""
        isNums = False

        for i in range(0, len(s)):
            if s[i] in whitespace and not isNums:
                pass
            elif s[i] in symbols and not isNums:
                if i == len(s) - 1 or s[i + 1] not in nums:
                    break
                if s[i] == "-":
                    num += "-"
            elif s[i] in nums:
                num += s[i]
                isNums = True
            else:
                break
        
        if (num == ""):
            return 0
        elif (int(num) > 2**31 - 1):
            return 2**31 - 1
        elif (int(num) < -2**31):
            return -2**31
        else:
            return int(num)