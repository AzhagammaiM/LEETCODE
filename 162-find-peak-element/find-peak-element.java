class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while(low < high){
            int mid = low + (high - low)/2;
            
            if(nums[mid] > nums[mid + 1]){
                // descending part → peak on left or mid
                high = mid;
            } else {
                // ascending part → peak on right
                low = mid + 1;
            }
        }
        return low; // low == high → peak index
    }
}
