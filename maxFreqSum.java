class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        String x="aeiou";int m=0,m1=0;
        for(char c:s.toCharArray()){
            if(a.containsKey(c)){
                a.put(c,a.get(c)+1);
            }
            else{
                a.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> v:a.entrySet()){
            char d=v.getKey();
            int val=v.getValue();
            if(x.contains(""+d)){
                if(val>m){
                    m=val;
                }
            }
            else{
                if(val>m1){
                    m1=val;
                }
            }
        }
        return m+m1;
    }
}
