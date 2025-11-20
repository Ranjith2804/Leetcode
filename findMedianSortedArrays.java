class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        double ans=0.0;
        int n11=n1.length;
        int n22=n2.length;
        List<Integer> a=new ArrayList<>();
        int l=0,r=0;
        while(l<n11 && r<n22 ){
            if(n1[l]<n2[r]){
                a.add(n1[l]);
                l++;
            }
            else{
                a.add(n2[r]);r++;
            }
        }
        while(l<n11){
            a.add(n1[l]);l++;
        }
        while(r<n22){
            a.add(n2[r]);r++;
        }
        int  k=a.size();
        if(k%2!=0){
            ans=a.get(k/2);
        }
        else {
            ans=(a.get(k/2 -1)+a.get(k/2))/2.0;
        }
        return ans;
    }
}
