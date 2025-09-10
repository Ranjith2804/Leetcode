class Solution {
    public int scoreOfString(String s) {
        char []c=s.toCharArray();
        int n=c.length;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(c[i]);
        }
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=Math.abs(a[i]-a[i+1]);
        }
        return sum;
    }
}
