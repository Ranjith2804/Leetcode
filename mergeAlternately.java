class Solution {
    public String mergeAlternately(String w1, String w2) {
        List<Character> a=new ArrayList<>();
        int n1=w1.length(),n2=w2.length();
        int  min=n1>n2?n2:n1;
        for(int i=0;i<min;i++){
            a.add(w1.charAt(i));
            a.add(w2.charAt(i));
        }
        String s="";
        for(char x:a){
            s+=x;
        }
        if(n1>n2) s+=w1.substring(min);
        else s+=w2.substring(min);
        return s;
    }
}
