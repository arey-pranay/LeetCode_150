class Pair{
    int first;
    int second;
    int index;
    public Pair(int first,int second, int i){
        this.first=first;
        this.second=second;
        this.index=i;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
		//In the minHeap array, 0th element refers to the curr element in nums1 and 1st element refers to curr element in nums2 
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> (a.first + a.second) - (b.first + b.second));
        
		// The 2nd element in the minHeap is the index of nums2, the corresponding element of nums2 is in index1 of minHeap
        for(int i=0; i < nums1.length && i < k; i++)
            minHeap.add(new Pair(nums1[i], nums2[0],0));
        
        List<List<Integer>> result = new ArrayList<>();
        
        while(k-->0 && !minHeap.isEmpty()){
            Pair temp= minHeap.poll();
            int val1=temp.first;
            int val2=temp.second;
        
            result.add(List.of(val1,val2));
            int nums2Idx =temp.index;
            if(nums2Idx < nums2.length - 1)
                minHeap.add(new Pair(val1, nums2[nums2Idx + 1], nums2Idx + 1));
        
        }
        return result;
    }
}
