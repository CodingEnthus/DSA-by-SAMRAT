class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[j],height[i]);
            int width=Math.abs(i-j);
            int area=h*width;
            maxArea=Math.max(area,maxArea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}