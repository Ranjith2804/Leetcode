class Solution(object):
    def strStr(self, h, n):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if n not in h: 
            return -1
        else:
           return h.find(n)
