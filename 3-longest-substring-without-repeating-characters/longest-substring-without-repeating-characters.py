class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        i = 0
        res = 0

        while i < len(s):
            resString = ""
            
            checkChar = s[i]
            while checkChar not in resString:
                resString = resString + checkChar
                if i + len(resString) >= len(s):
                    break
                checkChar = s[i+len(resString)]

            res = max(res, len(resString))
            i += 1

        return res
            