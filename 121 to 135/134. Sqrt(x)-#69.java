class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
// class Solution {
//     public int mySqrt(int x) {
//         if (x == 0 || x == 1)
//             return x;

//         // Initialize the search range for the square root.
//         int start = 1;
//         int end = x;
//         int mid = -1;

//         // Perform binary search to find the square root of x.
//         while (start <= end) {
//             // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
//             mid = start + (end - start) / 2;

//             // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
//             if ((long) mid * mid > (long) x)
//                 end = mid - 1;
//             else if (mid * mid == x)
//                 // If the square of the middle value is equal to x, we found the square root.
//                 return mid;
//             else
//                 // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
//                 start = mid + 1;
//         }

      
//         return Math.round(end);
        
//     }
// }
