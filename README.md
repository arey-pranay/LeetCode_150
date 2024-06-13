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
