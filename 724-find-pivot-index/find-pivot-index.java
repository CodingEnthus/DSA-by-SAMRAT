class Solution {
    public int[] prefix;
    public void prefixSum(int[] nums){
        int n=nums.length;
        prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
    }
 
    public int pivotIndex(int[] nums) {
        prefixSum(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==prefix[n]-prefix[i+1]){
                return i;
            }
        }
        return -1;
    }
}