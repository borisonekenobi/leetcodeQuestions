class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if s[0] == ")" or s[0] == "}" or s[0] == "]" or s[-1] == "(" or s[-1] == "{" or s[-1] == "[":
            return False
        
        t = ""
        for i in range(0, len(s)):
            if s[i] == "(":
                t+="("
            elif s[i] == "{":
                t+="{"
            elif s[i] == "[":
                t+="["
                
            elif s[i] == ")":
                if len(t) == 0:
                    return False
                elif t[-1] == "(":
                    t = t[:len(t) - 1]
                else:
                    return False
            
            elif s[i] == "}":
                if len(t) == 0:
                    return False
                elif t[-1] == "{":
                    t = t[:len(t) - 1]
                else:
                    return False
                
            elif s[i] == "]":
                if len(t) == 0:
                    return False
                elif t[-1] == "[":
                    t = t[:len(t) - 1]
                else:
                    return False
        return len(t) == 0