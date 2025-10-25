class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(char c:columnTitle.toCharArray()){
            int x=c-'A'+1;
            r=r*26+x;
        }
        return r;
    }
}
