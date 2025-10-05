class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        char []c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            a.put(c[i],a.getOrDefault(c[i],0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(a.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
