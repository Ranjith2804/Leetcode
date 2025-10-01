class Solution {
    public int mostFrequentEven(int[] nums) {
        int d=-1,m=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                a.put(i,a.getOrDefault(i,0)+1);
            }
        }
        if(a.isEmpty()) return -1;
        for(Map.Entry<Integer,Integer> e:a.entrySet()){
            if(e.getValue()>m||e.getValue()==m && e.getKey()<d){
                m=e.getValue();
                d=e.getKey();
            }
        }
        return d;
    }
}
