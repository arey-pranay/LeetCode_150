class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i > -1 && j > -1 ) {
                if (nums1[i] >= nums2[j]){
                    nums1[k--] = nums1[i--];
                }
                else {
                    nums1[k--] = nums2[j--];
                }
        }
        if(i==-1){
            while(j>=0) nums1[k--] = nums2[j--];
        }
    }

    public void swap(int arr[], int arr2[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr2[j];
        arr2[j] = temp;
    }
}
