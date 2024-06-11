// Space O(n) and Time O(n)
class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        // Create an array to count the number of papers with a certain number of citations
        int[] citValue = new int[len + 1];

        // Fill the citValue array
        for (int i = 0; i < len; i++) {
            if(citations[i] >= len) {
                // If the number of citations is greater than or equal to the number of papers,
                // count it as a paper with 'len' citations (because h-index can't be greater than len)
                citValue[len]++;
            } else {
                // Otherwise, count the exact number of citations
                citValue[citations[i]]++;
            }
        }

        int runner = 0; // This variable will accumulate the number of papers
        // Traverse the citValue array from the end to the beginning
        for (int j = len; j >= 0; j--) {
            runner += citValue[j]; // Add the number of papers with 'j' citations to runner
            if (runner >= j) {
                // If the accumulated number of papers is at least 'j',
                // then 'j' is the h-index
                return j;
            }
        }
        // If no valid h-index is found, return 0
        return 0;
    }
}


// Space O(1) and Time O(n logn)

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int i;
        for(i=1;i<=n;i++){
            if(citations[n-i] < i) break;
        }
        return i-1;
    }
}
