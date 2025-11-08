class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> x=new ArrayList<>();
        HashSet<Integer> a=new HashSet<>();
        for(int i: nums){
            a.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                x.add(i);
            }
        }
        return x;
    }
}
