class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[^a-zA-Z0-9]+","");
        a=a.trim().toLowerCase();
        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)==a.charAt(j)){
                i++;j--;
            }
            else return false;
        }
        return true;
    }
}
