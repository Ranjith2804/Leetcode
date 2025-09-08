
class Solution {
    public boolean isHappy(int n) {
        int s=n,f=n;
        do{
            s=sq(s);
            f=sq(sq(f));
        }while(s!=f && f!=1);
    
        return f==1;
    }
    public int sq(int i){
        int ans=0;
        while(i>0){
            int reminder=i%10;
            ans+=reminder*reminder;
            i/=10;
        }
        return ans;
    }
}
