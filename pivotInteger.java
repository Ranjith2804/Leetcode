class Solution {
    public int pivotInteger(int n) {
        if(n==1) return n;
        int []p=new int[n];
        int []q=new int[n];
        int s=0,x=0,m=-1;
        for(int i=1;i<=n;i++){
            s+=i;
            p[x]=s;x++;
        }
        s=0;x=n-1;
        for(int i=n;i>0;i--){
            s+=i;
            q[x]=s;x--;
        }
        for(int i=0;i<n;i++){
            if(p[i]==q[i]) m=i+1;
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));
        return m;
    }
}
