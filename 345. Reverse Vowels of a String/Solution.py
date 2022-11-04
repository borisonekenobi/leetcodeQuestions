class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        vInS = []
        for l in s:
            if l in vowels:
                vInS.append(l)

        i = len(vInS) - 1
        for l in range(0, len(s)):
            if s[l] in vowels:
                s = s[0:l] + vInS[i] + s[l + 1:len(s)]
                i -= 1
        
        return s