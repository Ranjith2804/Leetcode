class Solution(object):
    def splitWordsBySeparator(self, w, s):
        a=[]
        for i in w:
            b=i.split(s)
            for j in b:
                if j:
                    a.append(j)
        return a   
        
        
