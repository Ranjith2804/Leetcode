class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> x=new ArrayList<>();
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int i:nums1){a.add(i);}
        for(int i:nums2){b.add(i);}
        for(int j:b){if(a.contains(j)){x.add(j);}}
        int []m=new int[x.size()];int c=0;
        for(int i:x){m[c]=i;c++;}
        return m;
    }
}
