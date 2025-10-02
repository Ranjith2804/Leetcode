class Solution {
    public char repeatedCharacter(String s) {
        List<Character> a=new ArrayList<>();
        char x='a';
        for(char c:s.toCharArray()){
            if(a.contains(c)) {x=c;break;}
            else a.add(c);
        }
        return x;
    }
}
