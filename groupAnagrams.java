class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> x=new ArrayList<>();
        HashMap<String,List<String>>  a=new HashMap<>();
        for(String i:strs){
            char []c=i.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            /*
            if(!a.containsKey(s)){
                a.put(s,new ArrayList<>());
            }
            a.get(s).add(i);
            */
            a.computeIfAbsent(s,k-> new ArrayList<>()).add(i);
        }
        return new  ArrayList<>(a.values());
    }
}
