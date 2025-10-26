class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int []a=new int[nums.length];
        int x=0;
        for(int i:nums){
            if(i%2==0) {a[x]=i;x++;}
        }
        for(int i:nums){
            if(i%2!=0) {a[x]=i;x++;}
        }
        return a;
        
    }
}
