class Solution {
    public int[] getFinalState(int[] nums, int k, int mu) {
        for(int i=0;i<k;i++){
            int min=nums[0],m=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]< min) {min=nums[j];m=j;}
            }
            nums[m]=nums[m]*mu;
        }
        return nums;
    }
}
