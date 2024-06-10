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
