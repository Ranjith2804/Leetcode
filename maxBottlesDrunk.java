class Solution {
    public int maxBottlesDrunk(int b, int ex) {
        int e=0,s=0;
        while(b>0||e>=ex){
            if(e>=ex){
                e=e-ex;
                ex++;
                b++;
            }
            else{
                e+=b;s+=b;b=0;
            }
        }
        return s;
    }
}
