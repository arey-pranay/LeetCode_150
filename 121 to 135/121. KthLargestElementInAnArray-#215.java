class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values in the array
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        // Create a counting array with the size based on the range of numbers
        int arr[] = new int[max - min + 1];

        // Fill the counting array with the frequency of each number
        for (int num : nums) {
            arr[num - min]++;
        }

        // Traverse the counting array from the end to find the k-th largest element
        int remain = k;
        for (int j = arr.length - 1; j >= 0; j--) {
            remain -= arr[j];
            if (remain <= 0) {
                return j + min; // Return the k-th largest element
            }
        }

        return -1; // If the k-th largest element is not found, return -1 (this case shouldn't occur with valid input)
    }
}
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return (nums[nums.length-k]);
//     }
// }
// public class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//         for (int i = 0; i < k; i++) {
//             minHeap.offer(nums[i]);
//         }
        
//         for (int i = k; i < nums.length; i++) {
//             if (nums[i] > minHeap.peek()) {
//                 minHeap.poll();
//                 minHeap.offer(nums[i]);
//             }
//         }
        
//         return minHeap.peek();
//     }
// }
// public class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int left = 0, right = nums.length - 1;
//         Random rand = new Random();
//         while (true) {
//             int pivot_index = left + rand.nextInt(right - left + 1);
//             int new_pivot_index = partition(nums, left, right, pivot_index);
//             if (new_pivot_index == nums.length - k) {
//                 return nums[new_pivot_index];
//             } else if (new_pivot_index > nums.length - k) {
//                 right = new_pivot_index - 1;
//             } else {
//                 left = new_pivot_index + 1;
//             }
//         }
//     }

//     private int partition(int[] nums, int left, int right, int pivot_index) {
//         int pivot = nums[pivot_index];
//         swap(nums, pivot_index, right);
//         int stored_index = left;
//         for (int i = left; i < right; i++) {
//             if (nums[i] < pivot) {
//                 swap(nums, i, stored_index);
//                 stored_index++;
//             }
//         }
//         swap(nums, right, stored_index);
//         return stored_index;
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }
