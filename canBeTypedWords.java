class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []a=text.split(" ");int m=0;
        char []c=brokenLetters.toCharArray();
        for(String i: a){
            boolean f=false;
            for(char x:c){
                if(i.contains(""+x)){
                    f=true;
                }
            }
            if(f)m+=1;
        }
        return a.length-m;
    }
}
