# LeetCode_150

## 1 to 15

#### 1. Merge Sorted Arrays
  - 3 pointer approach: m,n,m+n
  - Start from the last
#### 2. Remove element
  - 2 pointer approach: 0,length
  - if matched, then swap
#### 3. Remove Duplicate
  - Keep track of non-duplicated index
  - Keep putting the unique element in front
#### 4. Remove more than 2 Duplicates
  - Start from 1st index and compare with the current unique val
  - Use a seperate cond to 'set count and assign curr' and a separate cond to 'put values with count<2 at proper index and updating the index'
#### 5. Majority Element
  - Moore's Voting Algorithm. Initialize count and candidate with 0
  - Re-assign the candidate whenever count == 0. If match then count++ else count--.
#### 6. Rotate Array
  - Reverse the entire array
  - Reverse from 0 to k, Reverse from k to nums.length
#### 7. BuySellStock
  - Buy at first day, with initial profit =0
  - Update BP on lesser p[i] and update profit on greater p[i]-BP
#### 8. BuySell Multiple Stocks
  - Buy everyday
  - And only if there is a profit (bp < prices[i]), then sell it and add it to the total profit.
#### 9. JumpGame
  - Start from the second last and keep updating which is the index that you can safely reach. If you can reach 0 then you can return true, otherwise false
  - It means that  if (i + nums[i] >= lastGoodIndex) lastGoodIndex = i; // Update the last good index
#### 10. JumpGame MinJumps 🤯
  - Start from 0, and update the i after calculating from a function.
  - The function checks what is the max index you can reach from a given point in 1 single jump and updates the value of i and jumps. No. of function calls is the min no. of jumps.
#### 11. H-Index 🤯
  - Sort Array. Go from start to end.
  - If citations[n-i]<i then break and return
#### 12. O(1) Insert, Remove and Random
  - Create a Map (to store values with their positions) and a list (to get the numbers out). Insert: put(val,pos) , add(val) . Random: list.get(rand.nextInt(list.size()));
  - Delete: pos = dict.get(val) , store lastEl , set(pos,lastEl) , put(lastEl, pos), map.remove(val) and remove last of list.

#### 13. Product Except Self
  - Create new arrays for prefix product and suffix product. pre[i] = pre[i-1] * nums[i-1] ; suf[sz-i-1] = suf[sz-i] * nums[sz-i];
  - And then multiply resp suffix sum to the prefix sum.             pre[i] *= suf[i];

#### 14. Gas Station
  - Calculate total gas and total cost. The thing is that if you can go from 2 to 8 and lose at 8. Then try starting from 9 and reaching 2 coz now yk that you can reach from 2 to 8 if you reach 2.
  - total += gas[i] - cost[i];  if(total < 0) {total =0; res = i+1}

#### 15. Candy 😐

#### 16. Trapping Rainwater 😐

#### 17. RomanToInteger
  - Start from last. Switch-Case from I to M. if(num<prev)ans-=num; else ans+=num; prev = num; 
  - Because for normal numbers (without 4,9,40,90, etc.) the symbols are always in increasing order from L to R.

#### 18. IntegerToRoman
  - Create a string and keep appending  while (num >= 1000) { sb.append('M'); num -= 1000; } for  900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1.
  - OR create 3 arrays for storing 0 to 9th value of ones, tens hundreds, and a seperae for ["","M","MM","MMM"]. return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];

#### 19. Length of last word
  - Start from last, keep going until you find a space, and keep incrementing the count and then return count on finding a space. (Remove the trailing spaces)
  - OR convert the string to array by using .split(" ") and return the length of the string situated at the last index.

#### 20. Length of longest common prefix
  - Assume the first string is completely the prefix, and for each subseq string, until to get an indexOf the prefix, keep updating it by substring(-ing) it to 1 less char.
  - When a match is found, compare the updated new prefix with the next String in the array. 

