class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max_area=0;
        int l=0, r=n-1;
        while(l<=r){
            int h=Math.min(height[l],height[r]);  // calculating height
            int w=r-l;  // calculating width
            int area=w*h;
            max_area=Math.max(area, max_area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_area;
    }
}