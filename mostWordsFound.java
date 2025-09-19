class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(String i:s){
            String [] a=i.split(" ");
            if(a.length>max) max=a.length;
        }
        return max;
    }
}
