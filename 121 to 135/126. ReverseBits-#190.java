// public class Solution {
//     // you need treat n as an unsigned value
//     public int reverseBits(int n) {
//         String s = Integer.toBinaryString(n);
//         while(s.length()!=32){
//             s= '0'+s;
//         }
//         String ans = "";
//         for(int i=31;i>=0;i--){
//             ans += s.charAt(i);
//         }
//         System.out.println(ans);
//         return Integer.parseUnsignedInt(ans,2);
//     }
// }
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++)
        {
            rev<<=1; // rev = rev<<1
            rev |=(n&1); // rev = rev ||  n&&1
            n>>=1; //n = n>>1
        }
        return rev;
    }
}
