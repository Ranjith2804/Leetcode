class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> x=new ArrayList<>();
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int[] i:items1){a.put(i[0],a.getOrDefault(i[0],0)+i[1]);} 
        for(int[] i:items2){
            if(a.containsKey(i[0])){a.put(i[0],a.get(i[0])+i[1]);}
            else a.put(i[0],i[1]);
        }
        List<Integer> c=new ArrayList<>(a.keySet());
        for(int i:c){
            x.add(Arrays.asList(i,a.get(i)));
        }
        x.sort(Comparator.comparingInt(list->list.get(0)));
        return x;

    }
}
