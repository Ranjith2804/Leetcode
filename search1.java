class Solution {
    public boolean search(int[] nums, int target) {
        boolean a=false;
        for(int i:nums){
            if(i==target){
                a=true;
            }
        }
        return a;
    }
}
