class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        String a="";
        char c=0;
        int cx=0;
        for(char x:s.toCharArray()){
            if(x==c) cx++;
            else{c=x;cx=1;}
            if(cx<3) sb.append(c);
        }
        return sb.toString();
    }
}
