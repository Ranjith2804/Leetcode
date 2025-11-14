class Solution {
    public int maxOperations(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                a++;
            }
            else if(i>0 && s.charAt(i-1)=='1'){
                b+=a;
            }
        }
        return b;
    }
}
