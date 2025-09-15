class Solution {
    public int[] buildArray(int[] nums) {
        if(nums==null) return null;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[nums[i]];
        }
        return a;
    }
}
