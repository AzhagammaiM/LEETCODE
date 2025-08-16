class Solution {
    public int singleNonDuplicate(int[] arr) {
        // int left=0,right=arr.length-1;
        // while(left<right){
        //     int mid=left+(right-left)/2;
        //     if(mid%2==1)mid-=1;
        //     if(arr[mid]!=arr[mid+1])right=mid;
        //     else left=mid+2;
        // }
        // return arr[left];
         int result = 0;
        for (int num : arr) {
            result ^= num; // XOR all elements
        }
        return result; // Remaining number is the single element
    }
}