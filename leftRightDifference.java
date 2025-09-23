class Solution {
    public int[] right(int[] a){
        int []x=new int[a.length];
        x[a.length-1]=0;int k=0;
        for(int i=1;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
            }
            x[k]=sum;k++;
        }
        System.out.print(Arrays.toString(x));
        return x;
    }
    public int[] left(int[] a){
        // if(a.length==1) return [0];
        int []x=new int[a.length];
        x[0]=0;int k=1;
        for(int i=0;i<a.length-1;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=a[j];
            }
            x[k]=sum;k++;
        }
        System.out.print(Arrays.toString(x));
        return x;
    }
    public int[] leftRightDifference(int[] nums) {
       //if(nums.length==1) return new int[0];
        int [] a=left(nums);
        int [] b=right(nums);
        for(int i=0;i<nums.length;i++){
            a[i]=Math.abs(a[i]-b[i]);
        }
        return a;
    }
}
