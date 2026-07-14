class Solution {
    int maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int ws=0;
        for(int i=0;i<k;i++){
            ws+=nums[i];
        }
        int max_sum=ws;
        for(int j=k;j<n;j++){
            ws+=nums[j];  // Add the element sliding into the window
            ws-=nums[j-k];  // Subtract the element sliding out of the window
            max_sum=Math.max(max_sum, ws);
        }
        return max_sum;
    }
};