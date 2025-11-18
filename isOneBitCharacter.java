class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length,i;
        for(i=0;i<n-1;){
            i+=bits[i]+1;
        }
        return i==n-1;
    }
}
