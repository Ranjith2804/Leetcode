class Solution {
    public int balancedStringSplit(String s) {
        char []c=s.toCharArray();
        int a=0,b=0,sum=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='R') a++;
            if(c[i]=='L') b++;
            if(a==b) sum++;
        }
        return sum;
    }
}
