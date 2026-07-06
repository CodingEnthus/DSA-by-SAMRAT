class Solution {
    int minimum(int[] arr){
        int min=arr[0];
        for(int x: arr){
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int min=minimum(nums);
        return min;
        
    }
}