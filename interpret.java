class Solution {
    public String interpret(String c) {
        // String x="";
        // int n=c.length();
        // for(int i=0;i<n-1;i++){
        //     if(c.charAt(i)!='('&&c.charAt(i)!=')'){ x+=""+c.charAt(i);}
        //     else if(c.charAt(i)=='('&&c.charAt(i+1)==')') {x+="o";}
        //     System.out.println(i+" "+x);
        // }
        // if(c.charAt(n-1)!='('&&c.charAt(n-1)!=')'){ x+=""+c.charAt(n-1);}
        // return x;
        // StringBuilder x= new StringBuilder();
        // for(int i=0;i<n;i++){
        //     if(c.charAt(i)=='('&&c.charAt(i+1)==')'){ x.append("o");i++;}
        //     else if(c.charAt(i)=='('||c.charAt(i)==')') continue;
        //     else x.append(""+c.charAt(i));
        // }
        // return x.toString();
        String a=c.replace("()","o");
        String x=a.replace("(","").replace(")","");
        return x;
    }
}
