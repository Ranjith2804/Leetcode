class Solution {
    public int maxAdjacentDistance(int[] nums) {
        System.out.println(nums[0]+""+nums[nums.length-1]);
        int r=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            r=Math.max(r,Math.abs(nums[i]-nums[i+1]));
        }
        return r;
    }
}
