class Solution {
    public int numberOfMatches(int n) {
        int a=n,m=0,x=0;
        while(a>1){
            if(a%2==1){ m+=(a-1)/2;a=((a-1)/2)+1;}
            if(a%2==0){ m+=(a/2);a=(a/2);}
        }
        return m;
    }
}
