class Solution(object):
    def wordPattern(self, p, st):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """    
        s = p
        t = st.split()
        return map(s.find, s) == map(t.index, t)
