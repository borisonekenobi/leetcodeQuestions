class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        a = []
        for i in range(1, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                a.append("FizzBuzz")
            elif i % 3 == 0:
                a.append("Fizz")
            elif i % 5 == 0:
                a.append("Buzz")
            else:
                a.append(str(i))
        return a