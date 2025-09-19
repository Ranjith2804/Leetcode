class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,x=0;
        int[] a=new int[nums.length];
        for(int i:nums){
            sum+=i;
            a[x]=sum;x++;
        }
        return a;
    }
}
