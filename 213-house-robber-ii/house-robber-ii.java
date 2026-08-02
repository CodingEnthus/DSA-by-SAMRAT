class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int n=nums.length;

        return Math.max(robLinear(nums,0,n-2),robLinear(nums,1,n-1));
    }
    public int robLinear(int[] nums,int start,int end){
        int dp1=0;
        int dp2=0;
        for(int i=start;i<=end;i++){
            int current=Math.max(dp1,dp2+nums[i]);
            dp2=dp1;
            dp1=current;
        }
        return dp1;
    }
}