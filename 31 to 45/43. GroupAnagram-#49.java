class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store the sorted version of the string as key and list of anagrams as value
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to character array and sort it
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            // Convert sorted char array back to string
            String sorted = new String(cArr);
            
            // If the sorted string is not in the map, add it with a new list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            // Add the original string to the list corresponding to the sorted string
            map.get(sorted).add(s);
        }

        // Create a list of lists to store the grouped anagrams
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String,String> h1 = new HashMap<>();// word, sorted
//         for(String s : strs){
//             char[] cArr = s.toCharArray();
//             Arrays.sort(cArr);
//             h1.put(s, new String(cArr));
//         } 
//         HashMap<String, List<String>> h2 = new HashMap<>();// sorted,[ words ]
//         for(Map.Entry<String,String> el: h1.entrySet()){  
//             String kk = el.getKey();
//             String vv = el.getValue();  
//             if(!h2.containsKey(vv)){
//                 List<String> l = new ArrayList<>();
//                 l.add(kk);
//                 h2.put(vv,l);
//             } else {
//                 List<String> l = h2.get(vv);
//                 l.add(kk);
//                 h2.put(vv,l);
//             }
//         }
//         List<List<String>> ans = new ArrayList<>(); // list of all values of h2
//         for(Map.Entry<String,List<String>> el: h2.entrySet()){
//             ans.add(el.getValue());
//         }
//         return ans;
//     }
// }


//         for(int i=0;i<strs.length;i++){
//             String s = strs[i];
//             char[] arr = s.toCharArray();
//             Arrrays.sort(arr);
//             strs[i] = new String(arr);
//         }
//         Arrays.sort(strs);
//         List<List<String>> ans = new List<>();
//         String curr = strs[0];
//         List<String> temp = new List<>();
//         for(String s: strs){
//             if(strs[i]==curr) temp.add(curr)
//             else {
//                 ans.add(temp); 
//                 temp = new List<>();
//             }
//         }
//         System.out.println("Total number of possible groups of anagrams are: " ans.size());
