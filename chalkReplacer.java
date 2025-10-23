class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0,a=k;
        int x=0;
        for(int i:chalk){sum+=i;}
        a=a%sum;
        for(int i=0;i<chalk.length;i++){
            if(a<chalk[i]){ x=i;break;}
            a-=chalk[i];
        }
        return x;
    }
}
