// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }
class Solution {
    public int majorityElement(int[] n) {
        int c=0,c1=0;
        for(int i=0;i<n.length;i++){
            if(c1==0){
                c=n[i];
                c1=1;
            }
            else{
                if(c==n[i]) c1++;
                else c1--;
            }
        }
        return c;
    }
}
