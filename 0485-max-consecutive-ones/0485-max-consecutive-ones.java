class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max=0;
        int n=nums.length;
        int j=0;
        while(j<n){
            if(nums[j]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
            j++;
        }
        return Math.max(max,count);
    }
}