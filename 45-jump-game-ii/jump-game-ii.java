class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int reach=0;
        int farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(i+nums[i],farthest);
            if(i==reach){
                reach=farthest;
                jump++;

            }
        }
        return jump;
    }
}