class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        List<int[]> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new int[]{nums[i],i});
        }
        Collections.sort(a,(k1, k2) -> Integer.compare(k1[0], k2[0]));
        Collections.sort(a.subList(n-k,n),(k1, k2) -> Integer.compare(k1[1], k2[1]));
        return a.subList(n-k,n).stream().mapToInt(m -> m[0]).toArray();
    }
}
