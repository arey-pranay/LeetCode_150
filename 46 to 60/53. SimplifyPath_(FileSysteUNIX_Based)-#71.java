// class Solution {
//     public String simplifyPath(String path) {
//         char[] cArr = path.toCharArray();
//         String temp = "";
//         int dots = 0;
//         Stack<String> st = new Stack<>();
//         for(char c : cArr){
//             if(dots==2 && c=='/'){
//                 if(st.size()>0)st.pop();
//                 dots= 0;
//             } else if (dots >= 2 && c == '.'){
//                 dots++;
//                 temp = "/";
//                 temp += (".").repeat(dots);
//             } else if(c=='.'){
//                 dots++;
//             } else if(c=='/'){
//                 if(temp.length()>0 &&(!temp.equals("/"))){
//                     st.push(temp);
//                     temp = "";
//                 }
//                 temp="/";
//                 dots = 0;
//             } else {
//                 temp+=c;
//             }
//         }
        
//         if(dots==2){
//             if(st.size()>0)st.pop();
//         } 
//         else if (dots >= 2){
//                 // dots++;
//                 temp = "/";
//                 temp += (".").repeat(dots);
//         }
//         System.out.println(st);
//         int i=0;
//         if ((!temp.equals("")) && (!temp.equals("/"))) st.push(temp);
//         System.out.println(st);
//         if(st.size()>0) temp = st.pop();
//         String ans = "";
//         while(!st.isEmpty()){
//            ans = st.pop() + temp;
//            temp = ans;
//         }
//         if(ans.equals("")) return temp;
//         return ans;
//     }
// }

// // .. => st.pop()
// // if(not / or not . )s+=c


// // d
// // b
// // ...

class Solution {
        public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] arr = path.split("/");
        for (int i = 0;i < arr.length;i++)
        {
            if (arr[i].equals(".."))
            {
                if (!stack.isEmpty())
                    stack.pop();
            }
            else if (arr[i].equals(".") || arr[i].equals(""))
                continue;
            else
                stack.push(arr[i]);
        }
        for (int i = 0; i < stack.size();i++)
        {
            res.append("/").append(stack.get(i));
        }
    
        if (res.isEmpty())
            return "/";
        else
            return res.toString();
    }

}
