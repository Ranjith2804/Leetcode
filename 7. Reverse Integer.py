class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        n=1
        if(x<0):
            n=-1
            a=str(x)[1:]
        else:
            a=str(x)
        x= int(a[::-1])
        return 0 if x > pow(2, 31) else x * n
         
       
