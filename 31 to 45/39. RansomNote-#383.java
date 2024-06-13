class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> h = new HashMap<>();
        char c;
        for(int i =0;i<magazine.length();i++){
            c = magazine.charAt(i);
            if(!h.containsKey(c)) h.put(c,1);
            else h.put(c,h.get(c)+1); 
        }
        for(int i =0;i<ransomNote.length();i++){
            c = ransomNote.charAt(i);
            if(!h.containsKey(c) || h.get(c)<=0) return false;
            else h.put(c,h.get(c)-1); 
        }
        return true;        
    }
}
