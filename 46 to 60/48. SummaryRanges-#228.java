class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();
        if(nums.length==0)return ans;

        List<Integer> l = new ArrayList<>();
        int need = nums[0] + 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=need){
                l.add(need);
            }
            need = nums[i]+1;
        }

        String curr = "";
        if(nums.length ==1) {
            curr += nums[0];
            ans.add(curr);
            return ans;
        }

        int j =0;
        for(int i=0;i<nums.length;i++){
            if(l.size() > 0 && nums[i]==(l.get(j)-1)){
                if(curr!="") curr += "->";
                curr += nums[i];
                ans.add(curr);
                curr = "";  
                if(j<l.size()-1) j++;
            }
            else if(curr == "") curr+=nums[i];
        }   
        String temp = "";
        temp += nums[nums.length-1];
        if(!curr.equals(temp)) {
            curr+="->";
            curr+=nums[nums.length-1];
        }
        ans.add(curr);
        return ans;
    }
}
