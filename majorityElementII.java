class Solution {
    public List<Integer> majorityElementII(int[] n) {
        List<Integer> a=new ArrayList<>();
        int c1,cc,d1,dd;
        c1=cc=d1=dd=0;
        for(int i=0;i<n.length;i++){
            if(c1==n[i]) cc++;
            else if(d1==n[i]) dd++;
            else if(cc==0){c1=n[i];cc++;}
            else if(dd==0){d1=n[i];dd++;}
            else {cc--;dd--;}
        }
        cc=dd=0;
        for(int i:n){
            if(c1==i) cc++;
            else if(d1==i)dd++;
            }
        if(cc>n.length/3)   a.add(c1);
        if(dd>n.length/3)   a.add(d1);
        return a;
    }
}
