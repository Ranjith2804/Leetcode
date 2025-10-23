class Solution {
    public int largestAltitude(int[] gain) {
        int []a=new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            a[i+1]=a[i]+gain[i];
        }
        System.out.print(Arrays.toString(a));
        int x=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>x) x=a[i];
        }
        return x;
    }
}
