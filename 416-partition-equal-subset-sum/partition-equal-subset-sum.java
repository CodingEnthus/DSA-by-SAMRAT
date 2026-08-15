class Solution {
    public boolean solve(int[] nums,int targetSum,int n,Boolean[][] dp) {
        if(n==0) return false;
        if(targetSum==0) return true;
       if(dp[n][targetSum]!=null) return dp[n][targetSum];
       if(nums[n-1]<=targetSum){
        dp[n][targetSum]=solve(nums,targetSum-nums[n-1],n-1,dp) || solve(nums,targetSum,n-1,dp);
       }else{
        dp[n][targetSum]=solve(nums,targetSum,n-1,dp);
       }
       return dp[n][targetSum];
    }
    public boolean canPartition(int[] nums){
        int sum=0;
       int n=nums.length;
       for(int x: nums){
        sum+=x;
       }
       if(sum%2!=0){
        return false;
       }
       int targetSum=sum/2;
       Boolean[][] dp=new Boolean[n+1][targetSum+1];
       return solve(nums,targetSum,n,dp);

    }
}