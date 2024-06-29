# LeetCode_150

## 1 to 15
### <ins> Arrays / Strings </ins>
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

## 15 to 30

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

#### 21. Reverse Words in a string
  -  Start from last indx. Skip trailing spaces (i, last to spaces). Find the end of the current word (j, i to notSpaces).
  -  Add all from j to i as a work in new array and then i = j-1.

#### 22. ZigZag Conversion
  - No real matrix, just imagine one. Go row-wise, for 1st and last row, increment is same as normal incr (, = 2 * (numRows - 1))
  - Else, for rows in middle, keep adding the diagonal elements ( j += (inc - (2 * i)); ) and j+=2*i for the next element of the row with a complete column.

#### 23. Index of first occurence in a string
  - return haystack.indexOf(needle);
  - OR i is no. of elements that we've traversed through the haystack before entering the check process, and j is np. of elements matched. haystack.charAt(i+j)==needle.charAt(j)

#### 24. Text Justification 😐

- ### Two Pointers

#### 25. Valid Palindrome
  - Convert to int and compare the left and right character while low < high. int left = s.charAt(low); 48 is 0 to 9, 65 is a to z, 97 is A to Z.
  - If anything except those 3 conditions, then low++ or high--. Otherwise compare the integer values.
    
#### 26. Is Subsequence
  - You have to find s in t as subsequence. initialize i&j =0. while(true) do j++ everytime. And do i++ only when characters match. 
  - if i==s.length then return true. if j==t.length then return false. Otherwise keep iterting like this.

#### 27. TwoSum - II (Input is sorted array)
  - Start by adding first and last elements. If target is greater, then you need bigger number, so i++.
  - If target is smaller, then you need smaller number, j--. Return when target is found.

#### 28. Container with most water
  - Start from extremes, and at every iteration, calculate minHeight of l and r. Then calculate and update maxArea by using minHeight*(r-l).
  - while(arr[l] <= minHeight) l++ and same for right. Keep going while l<r.

#### 29. Three Sum
  - Sort the array. i=0. while(i<sz) j=i+1 and k=sz-1. while (j<k) if nums[i]+nums[j]+nums[k]==0 then add all of them to hashset.
  - Else if >0 so you need a smaller number then k--. Else (sum<0 and you need a bigger number) then j++ is done.

- ### Sliding Window

#### 30. Minimum Size Subarray Sum
  - Start from a window of length 1 with only the 0th element. Add next element by j++ and sum+=j. Whenever sum exceeds the target, do sum-=nums[i] and i++.
  - Maintain a min that stores the minimum length of subarray by maintaining the value of j-i+1 whenever the target is found. astly just return min.

## 31 to 45

#### 31. Longest Substring without repeating characters
  - Create a char to int hashmap of lastseen. Put start =0. Traverse from the 0th index and for each index if lastSeen.contains(s.charAt(i)).
  - Then start = Math.max(start, lastSeen.get(currentChar) + 1); and then update the lastseen by putting s.charAt(i),i. And update maxLength = Math.max(maxLength, i-start+1)

#### 32. Substring with concatenation of all words 😐

#### 33. Minimum Window Substring 😐

- ### Matrix ✨

#### 34. 
