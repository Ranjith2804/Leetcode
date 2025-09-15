class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a=new int[nums.length*2];
        int i=0,k=0;
        while(k<2){for(int j:nums){
            a[i]=j;
            i++;
        }k++;}
        return a;
    }
}
