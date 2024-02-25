class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=list(s)
        l=0
        r=len(s)-1
        m='aeiouAEIOU'
        while l<r:
            if s[l] in m and s[r] in m :
                s[l],s[r] =s[r],s[l]
                l+=1
                r-=1
            elif s[l] not in m:
                l+=1
            elif s[r] not in m:
                r-=1
        return "".join(s)
