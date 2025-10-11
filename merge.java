class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int a=0,b=0;
        if(m==0 && n!=0){ 
            for(int i:n2)
            {
                n1[b]=i;b++;
            }
        }
        else if(m!=0 && n!=0){
            for(int i=m;i<m+n;i++){
                n1[i]=n2[a];a++;
            }
            Arrays.sort(n1);
        }
        
    }
}
