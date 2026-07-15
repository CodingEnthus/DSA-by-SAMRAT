class Solution {
    public int leftSum(int[] nums,int x){
        int s=0;
        for(int i=0;i<x;i++){
            s+=nums[i];
        }
        return s;
    }
    public int rightSum(int[] nums,int x){
        int s=0;
        for(int i=x+1;i<nums.length;i++){
            s+=nums[i];
        }
        return s;
    }
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(leftSum(nums,i)==rightSum(nums,i)){
                return i;
            }
        }
        return -1;
    }
}