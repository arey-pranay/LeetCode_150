class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        int sz = nums.length;
        int i = 0;
        while(i<sz){
            int j = i+1;
            int k = sz-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]); l.add(nums[j]); l.add(nums[k]);
                    s.add(l);
                    j++;
                    k--;
                } else if (nums[i]+nums[j]+nums[k]>0){
                    k--;
                } else j++;
            }
            i++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l : s) ans.add(l);
        return ans;
    }
}
