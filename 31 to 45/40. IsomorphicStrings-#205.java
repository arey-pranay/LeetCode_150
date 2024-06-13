import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths are not the same, they cannot be isomorphic
        if (s.length() != t.length()) return false;

        // Maps to store character mappings from s to t and t to s
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check and establish mapping for s to t
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) return false;
            } else {
                mapS.put(charS, charT);
            }

            // Check and establish mapping for t to s
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) return false;
            } else {
                mapT.put(charT, charS);
            }
        }

        // If all characters map consistently, return true
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add")); // true
        System.out.println(solution.isIsomorphic("foo", "bar")); // false
        System.out.println(solution.isIsomorphic("paper", "title")); // true
    }
}
