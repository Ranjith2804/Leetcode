class Solution {
    public int romanToInt(String s) {
        char []c=s.toCharArray();
        int sum=0,n=0;
        for(int i=c.length-1;i>=0;i--){
            switch(c[i]){
                case 'I':
                    n=1;break;
                case 'V':
                    n=5;break;
                case 'X':
                    n=10;break;
                case 'L':
                    n=50;break;
                case 'C':
                   n=100;break;
                case 'D':
                   n=500;break;
                case 'M':
                   n=1000;break;
            }
            if(4*n<sum)sum-=n;
            else sum+=n;
        }
        return sum;
    }
}
