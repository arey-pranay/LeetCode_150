class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        int i =0;
        int j = s.length()-1;
        s = s.toLowerCase();
        System.out.println(s);
        while(i<=j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1)) {
                i++;
                continue;
                }
            if(!Character.isLetterOrDigit(c2)) {
                j--;
                continue;
                }
            if(c1!=c2) {
             System.out.print(c1 +" "+c2);
             return false;   
            }
            i++;
            j--;
        }
        return true;
    }
}
