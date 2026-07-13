class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];  //swapping
                nums[low]=0;  //low 0 ko handle kar raha hai so low ko 0 initialize kar denge
                low++; mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[high]; //swapping
                nums[high]=2; //high 2 ko handle kar raha hai so high ko 2 initialize kar denge
                high--;
            }
        }
    }
}