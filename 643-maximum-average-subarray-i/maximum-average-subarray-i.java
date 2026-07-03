class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int l=0;
        int r=k-1;
        double maxavg=0;
        double avg=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        maxavg=sum/k;
        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }
        return maxavg;
    }
}