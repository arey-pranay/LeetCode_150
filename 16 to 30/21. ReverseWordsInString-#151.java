class Solution {
    public String reverseWords(String s) {
        ArrayList<String> a = new ArrayList<>();
        boolean flag = false;
        String curr = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') flag = true;
            else{
                if(flag && s.charAt(i)!=' '){
                    if(!curr.equals(""))a.add(curr);
                    curr = "";
                    curr+=s.charAt(i);
                    flag = false;
                } else {
                    curr+=s.charAt(i);
                }
            }
        }
        a.add(curr);
        String answer = "";
        for(int i = a.size()-1;i>0;i--){
            answer+=a.get(i);
            answer+=" ";
        }
        answer+=a.get(0);
        return answer;
    }
}
// class Solution {
//     public String reverseWords(String s) {
//         // Convert the string to a character array for in-place modification
//         char[] str = s.toCharArray();

//         // Reverse the entire string
//         reverse(str, 0, str.length - 1);

//         int i = 0;
//         int l = 0, r = 0;
//         int n = str.length;

//         while (i < n) {
//             // Move i to the end of the current word
//             while (i < n && str[i] != ' ') {
//                 str[r++] = str[i++];
//             }

//             // If we found a word, reverse it
//             if (l < r) {
//                 reverse(str, l, r - 1);
//                 if (r < n) {
//                     str[r++] = ' ';
//                 }
//                 l = r;
//             }
//             i++;
//         }

//         // Remove the trailing space if there is one
//         if (r > 0 && str[r - 1] == ' ') {
//             r--;
//         }

//         // Convert the character array back to a string
//         return new String(str, 0, r);
//     }

//     // Helper method to reverse a portion of a character array
//     private void reverse(char[] str, int start, int end) {
//         while (start < end) {
//             char temp = str[start];
//             str[start] = str[end];
//             str[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
