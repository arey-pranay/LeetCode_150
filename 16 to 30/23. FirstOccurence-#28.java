// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        int hSz = haystack.length();
        int nSz = needle.length();
        //i is no. of elements that we've traversed through the haystack before entering the check process
        //j is np. of elements matched
        if(hSz < nSz)
            return -1;
        for(int i=0;i<=hSz-nSz;i++){
            int j=0;
            while(j<nSz && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j == nSz){
                return i;
            }
        }
        return -1;
    }
}
