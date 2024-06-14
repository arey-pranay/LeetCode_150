// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer> h = new HashMap<>();
//         if(s.length()!=t.length()) return false;
//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             if(!h.containsKey(c)) h.put(c,1);
//             else h.put(c,(h.get(c)+1));
//         }
//         for(int i =0;i<t.length();i++){
//             char c = t.charAt(i);
//             if(!h.containsKey(c) || (h.get(c)==0) ) return false;
//             else h.put(c,(h.get(c)-1));
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {

        int[] map = new int[26];

        for(char c: s.toCharArray()){
            map[c-'a']++;
        }

        for(char c: t.toCharArray()){
            map[c-'a']--;
        }

        for(int m: map){
            if(m != 0) return false;
        }

        return true;

        
    }
}
