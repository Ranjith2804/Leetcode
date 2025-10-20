class Solution {
    public String truncateSentence(String s, int k) {
        String a="";
        String []z=s.split(" ");
        for(int i=0;i<k-1;i++){
            a+=z[i];
            a+=" ";
        }
        a+=z[k-1];
        return a;
    }
}
