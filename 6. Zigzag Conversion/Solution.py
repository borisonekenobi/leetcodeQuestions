import math

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        output = ""
        numCols = math.ceil(1 + (len(s) - numRows) / (numRows * 2 - 2))

        for i in range(0, numCols):
            try:
                output += s[(i * 2) * (numRows - 1)]
            except:
                pass

        for j in range(1, numRows):
            for i in range(0, numCols):
                try:
                    if i == 0:
                        output += s[j]
                        pass
                    elif j == numRows - 1:
                        output += s[(i * 2) * (numRows - 1) + j]
                    else:
                        output += s[(i * 2) * (numRows - 1) - j]
                        output += s[(i * 2) * (numRows - 1) + j]
                except:
                    pass
        return output