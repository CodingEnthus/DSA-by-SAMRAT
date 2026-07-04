class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int zeroes=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
             if(nums[r]==0){
                    zeroes+=1;
                }
            if(zeroes<=k){
               
                maxlen=r-l+1;
            }else{
                if(nums[l]==0){
                    zeroes-=1;
                }
                l++;
            }
        }
        return maxlen;


    }
}