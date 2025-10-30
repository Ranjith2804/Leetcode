class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int dup=0,miss=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=1;i<=n;i++){   a.put(i,0);}
        for(int i:nums){   a.put(i,a.get(i)-1);}
        for(int i:a.keySet()){
           System.out.println(i+" "+a.get(i));
            if(a.get(i)==-2) dup=i;
            if(a.get(i)==0) miss=i;
        }
        return new int[]{dup,miss};
    }
}
