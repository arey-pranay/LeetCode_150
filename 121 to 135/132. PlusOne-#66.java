// class Solution {
//     public int[] plusOne(int[] digits) {
//         int sz = digits.length; 
//         int i = sz-1;
//         while(i>=0){
//             if(digits[i]!=9){
//                 digits[i]++;
//                 return digits;
//             } else {
//                 digits[i--] = 0;
//             }
//         }
//         int[] ans = new int[sz+1];
//         ans[0] = 1;
//         for(int j=1;j<sz+1;j++) ans[j] = digits[j-1];
//         return ans;
//     }
// }
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;

            }

        }
        int ans[] = new int[digits.length + 1];
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = 0;
        }
        return ans;
    }
}
