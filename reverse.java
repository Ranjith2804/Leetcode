class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if(x<0){neg=true;x*=-1;}
        String a=Integer.toString(x);
        char []y=a.toCharArray();
        char []z=new char[y.length];
        for(int i=0;i<y.length;i++){
            z[i]=y[y.length-1-i];
        }
        String c=new String(z);
        int v=0;
        try{
            v=Integer.parseInt(c);
        }
        catch(Exception e){
            return 0;
        }
        if(neg==true) v*=-1;
        return v;
    }
}
