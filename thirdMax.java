class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> a=new TreeSet<>();
        for(int i:nums){
            a.add(i);
        }
        if(a.size()>=3){
            a.pollLast();
            a.pollLast();
            return a.pollLast();
        }
        else return a.pollLast();
    }
}
