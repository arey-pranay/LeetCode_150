

// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         HashMap<Character, String> h = new HashMap<>();
//         ArrayList<String> arr = new ArrayList<>();
//         String temp = "";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 arr.add(temp);
//                 temp = "";
//             }
//             else temp += s.charAt(i);
//         }
//         // if(s.charAt(s.length()-1)!=' ')
//         arr.add(temp);
//         if(arr.size()!=pattern.length()) return false;
//         for(int i=0;i<arr.size();i++){
//             Character a = pattern.charAt(i);
//             String b = arr.get(i);
//             if(!h.containsKey(a)) 
//             h.put(a,b);
//             else if(!((h.get(a)).equals(b))) return false;    
//         }
//         HashSet<String> hs = new HashSet<>();
// for(Map.Entry<Character,String> el : h.entrySet()) {
//     if(hs.contains(el.getValue())) return false; else hs.add(el.getValue());
// }
//         return true;
//     }
// }


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }
}
