class Solution {
    public int[] runningSum(int[] nums) {
        int p=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            p+=nums[i];
            ans[i]=p;
        }
        return ans;
    }
}