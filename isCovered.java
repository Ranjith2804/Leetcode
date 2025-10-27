class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        //boolean a=false;
        for(int i=left;i<=right;i++){
             boolean a=false;
            for(int []x:ranges){
                if(x[0]<=i && x[1]>=i){
                    a=true; break;
                }
            }
            if(!a) return false;
        }
        return true;
    }
}
