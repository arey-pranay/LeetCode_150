class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a;
        int b;
        for(String c : tokens){
            if(c.equals("+")){
                a = s.pop();
                b = s.pop();
                s.push(b+a);
            }
            else if(c.equals("*")){
                a = s.pop();
                b = s.pop();
                s.push(b*a);
            }
            else if(c.equals("-")){
                a = s.pop();
                b = s.pop();
                s.push(b-a);
            }
            else if(c.equals("/")){
                a = s.pop();
                b = s.pop();
                s.push(b/a);
            }
            else s.push(Integer.valueOf(c));
        }
        return s.pop();
    }
}
