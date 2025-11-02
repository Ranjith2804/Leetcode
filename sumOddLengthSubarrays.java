class Solution {
    int add(int []a,int s,int e){
        int sum=0;
        while(e<=a.length){
            for(int i=s;i<e;i++){
                sum+=a[i];
            }
            s++;e++;
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int l=0,r=1,sum=0;
        while(r<=arr.length){
            sum+=add(arr,l,r);
            r+=2;
        }
        return sum;
    }
}
