class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a= new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        return nums.length!=a.size();
    }
}
