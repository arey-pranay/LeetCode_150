class Solution {
    public int longestConsecutive(int[] nums) {
        // Create a HashSet to store the unique numbers
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            h.add(num);
        }

        // Variable to store the length of the longest consecutive sequence
        int longestStreak = 0;

        // Iterate through each number in the set
        for (int num : h) {
            // Check if the current number is the start of a sequence
            if (!h.contains(num - 1)) {
                // Initialize the current number and the current streak length
                int currentNum = num;
                int currentStreak = 1;

                // Check for the next numbers in the sequence
                while (h.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak if the current streak is longer
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        // Return the length of the longest consecutive sequence
        return longestStreak;
    }
}
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> h = new HashSet<>();
//         if(nums.length==0) return 0;
//         for(int i:nums) h.add(i);
//         int count = 1;
//         int maxi = 1;
//         for(int i: h){
//             int find = i-1;
//             count = 1;
//             if(h.contains(find)){
//                 count++;
//                 find--;
//                 while(h.contains(find)) {
//                     count++;
//                     find--;
//                 }
//             }
//             maxi = Math.max(count,maxi);
//             count = 1;
//             find = i+1;
//             if(h.contains(find)){
//                 count++;
//                 find++;
//                 while(h.contains(find)){
//                     count++;
//                     find++;
//                 } 
//             } 
//             maxi = Math.max(count,maxi);
//         }
//         return maxi;
//     }
// }
