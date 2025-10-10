class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="",b="";
        for(String x:word1){ a+=x;}
        for(String x:word2){ b+=x;}
        System.out.println(a);
        System.out.println(b);
        return a.equals(b);
    }
}
