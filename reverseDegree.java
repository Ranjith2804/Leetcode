class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            char a=s.charAt(i-1);
            int d=123-a;
            sum+=d*i;
            //ystem.out.println(d+""+sum);
        }
        return sum;
    }

}
