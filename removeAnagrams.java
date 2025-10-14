class Solution {
    public List<String> removeAnagrams(String[] nums) {
        int n=nums.length;
        List<String> a=new ArrayList<>();
        a.add(nums[0]);
        //for(String i:nums){ a.add(i);}
        for(int i=0,j=i+1;i<n-1 && j<n;i++,j++){
            char []c=nums[i].toCharArray();
            char []d=nums[j].toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            String x=new String(c);
            String y=new String(d);
            if(!x.equals(y)) a.add(nums[j]);
        }
        return a;

    }
}
