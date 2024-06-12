class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j = 0;
        if(s.length()>t.length()) return false;
        while(true){
            if(i==s.length()) return true;
            if(j==t.length()) return false;
            if(s.charAt(i)==t.charAt(j)) i++;               
            j++;
        }
    }
}
