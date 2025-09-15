class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int []a=new int[nums.length];
        int k=0,x=0;
        for(int i:nums){
            if(i<p){
                a[x]=i;x++;
            }
        }
        for(int i:nums){
            if(i==p){
                a[x]=i;x++;
            }
        }
        for(int i:nums){
            if(i>p){
                a[x]=i;x++;
            }
        }
        return a;
    }
}
