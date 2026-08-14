class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        return Math.max(robLinear(0,n-2,nums),robLinear(1,n-1,nums));

    }
    public int robLinear(int start,int end,int[] nums){
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