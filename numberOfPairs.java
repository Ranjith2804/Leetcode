class Solution {
    public int numberOfPairs(int[] n1, int[] n2, int k) {
        int x=0;
        for(int i=0;i<=n1.length-1;i++){
            for(int j=0;j<=n2.length-1;j++){
                if(n1[i]%(n2[j]*k)==0) x++;
            }
        }
        return x;
    }
}
