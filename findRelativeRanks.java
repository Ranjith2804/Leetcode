class Solution {
    public String[] findRelativeRanks(int[] s) {
            int n=s.length,k=0;
            // Arrays.sort(a);
            // for(int i=0;i<n/2;i++){
                // int t=a[i];
                // a[i]=a[n-1-i];
                // a[n-1-i]=t;
            // }
            String [] c=new String[n];
            PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                p.add(s[i]);
            }
            HashMap<Integer,String> map=new HashMap<>();
            int i=1;
            while(!p.isEmpty()){
                if(i==1) map.put(p.remove(),"Gold Medal");
                else if(i==2) map.put(p.remove(),"Silver Medal");
                else if(i==3) map.put(p.remove(),"Bronze Medal");
                else map.put(p.remove(),Integer.toString(i));
                i++;
            }
            for(int j=0;j<n;j++){
                c[j]=map.get(s[j]);
            }
            return c;
    }
}
