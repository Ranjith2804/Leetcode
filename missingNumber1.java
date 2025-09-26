class Solution {
    public int missingNumber1(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            a.add(i);
        }
        for(int j:nums){
            a.remove((Integer)j);
        }
        return a.get(0);
    }
}
