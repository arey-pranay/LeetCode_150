// class Solution {
//     public String addBinary(String a, String b) {
//         char[] ac = a.toCharArray();
//         char[] bc = b.toCharArray();
//         int n = ac.length;
//         int m = bc.length;
//         int i = n-1;
//         int j = m-1;
//         String ans  = "";
//         char carry = '0';
//         char ad = '0';
//         while(i>=0 && j>=0){
//             if(ac[i]=='1'&& bc[j]=='1'){
//                 if(carry=='1'){
//                      ad = '1';
//                     carry = '1'; 
//                 } else {
//                      ad = '0';
//                     carry = '1'; 
//                 }
//             }
//             else if((ac[i]=='1'&&bc[j]=='0') || (ac[i]=='0'&&bc[j]=='1')){
//                 if(carry=='1'){
//                      ad = '0';
//                     carry = '1'; 
//                 } else {
//                      ad = '1';
//                     carry = '0'; 
//                 }
//             } else {
//                  ad = carry;
//                 carry = '0';
//             }
//             ans = ad+ans;
//             i--;
//             j--;
//         }
//         while(i>='0'){
//             if(carry=='0'){
//                 // ans.insert(0,ac[i]);
//                 ans = ac[i]+ans;
//             } else {
//                 if(ac[i]=='0'){
//                     // ans.insert(0,'1');
//                     ans = '1'+ans;
//                     carry = '0';
//                 } else {
//                     // ans.insert(0,'0');
//                     ans = '0'+ans;
//                 }
//             }
//             i--;
//         }
//         while(j>='0'){
//             if(carry=='0'){
//                 // ans.insert(0,bc[j]);
//                 ans = bc[j]+ans;
//             } else {
//                 if(bc[j]=='0'){
//                     // ans.insert(0,'1');
//                     ans = '1' + ans;
//                     carry = '0';
//                 } else {
//                     // ans.insert(0,'0');
//                     ans = '0'+ans;
//                 }
//             }
//             j--;
//         }
//         return ans;
//     }
// }
class Solution {
    public String addBinary(String a, String b) {
        {
// First, create result name string and intially it is empty & in the end we gonna return it as our aswer
        StringBuilder res = new StringBuilder(); 
        int i = a.length() - 1; // we create i pointer for string a and we have to start adding from right to left 
        int j = b.length() - 1; // similar pointer j for string b
        int carry = 0; // we create a carry, as we have to consider it as well
        // iterate over the loop until the both condition become false
        while(i >= 0 || j >= 0){ 
            int sum = carry; // intialise our sum with carry;
            
            // Now, we subtract by '0' to convert the numbers from a char type into an int, so we can perform operations on the numbers
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            // taking carry;
            carry = sum > 1 ? 1 : 0; // getting carry depend on the quotient we get by dividing sum / 2 that will be our carry. Carry could be either 1 or 0 
			// if sum is 0 res is 1 & then carry would be 0;
            // if sum is 1 res is 1 & carry would be 0
            // if sum is 2 res is 0 & carry would be 1
            // if sum is 3 res is 1 & carry would be 1
            res.append(sum % 2); // just moduling the sum so, we can get remainder and add it into our result
        }
        if(carry != 0) res.append(carry); // we gonna add it into res until carry becomes 0;
        return res.reverse().toString(); // revese the answer we get & convt to string and return by the help of result;
    }
}
}
