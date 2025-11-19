class Solution {
    public int findFinalValue(int[] nums, int o) {
        int r=o;
        List<Integer> a=new ArrayList<>();
        for(int i:nums){a.add(i);}
        while(a.contains(r)){
            r=r*2;
        }
        return r;
    }
}
