class Solution {
    public boolean isValid(String s) {
        //agr opening mila to uska corresponding closing stack me dalo
        //agr closing mila to stack ke top se compare krlo
        Stack<Character> st = new Stack<>();
        char[] cArr = s.toCharArray();
        for(char c: cArr){
            if(c=='(') st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else {
                if(st.size()==0) return false;
                if(c!=st.pop()) return false;
            }
        }
        if(st.size()!=0) return false;
        return true;
    }
}
