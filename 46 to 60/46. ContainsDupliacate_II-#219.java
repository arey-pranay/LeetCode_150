class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int p=mp.get(nums[i]);
                if(Math.abs(i-p)<=k){
                    return true;
                }
            }
                mp.put(nums[i],i);
            }
        
        return false;
    }
}

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int i =0;
//         int j = 1;
//         if(k==0) return false;
//         while(i<nums.length){
//             if(j==nums.length || j-i > k){
//                 System.out.println("i value is now incremented..");
//                 i++;
//                 j = i+1;
//                 continue;
//             }
//             if((j-i <= k) &&nums[i]==nums[j]) return true;
//             j++;
//         }
//         // if(nums.length>1 && nums[nums.length-1]==nums[nums.length-2]) return true;
//         return false;
//     }
// }
