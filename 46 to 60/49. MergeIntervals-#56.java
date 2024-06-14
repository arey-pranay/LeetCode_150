// class Solution {
//       public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//         int sz = intervals.length;
//         int needed = sz;
//         int oldN = 0;

//         if (sz > 1) {
//             do {
//                 if (oldN == needed) break;
//                 oldN = needed;
//                 for (int i = 0; i < sz - 1; i++) {
//                     if (intervals[i][1] >= intervals[i + 1][0]) {
//                         intervals[i + 1][0] = intervals[i][0];
//                         intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
//                         needed--;
//                     }
//                 }
//             } while (true);
//         }

//         for (int[] i : intervals) {
//             for (int j : i) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         int[][] ans = new int[needed][2];
//         int i = 0;
//         int j = 0;
//         ans[0][0] = intervals[0][0];
//         ans[0][1] = intervals[0][1];
        
//         while (i < sz && j < needed) {
//             if (intervals[i][0] != ans[j][0] || intervals[i][1] != ans[j][1]) {
//                 j++;
//                 if (j < needed) {
//                     ans[j][0] = intervals[i][0];
//                     ans[j][1] = intervals[i][1];
//                 }
//             }
//             i++;
//         }
//         return ans;
//     }
// }
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        
        // Sort intervals based on the starting times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // List to store merged intervals
        List<int[]> merged = new ArrayList<>();
        
        // Initialize with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) { // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else { // Non-overlapping interval, add to the list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Convert the list to an array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
