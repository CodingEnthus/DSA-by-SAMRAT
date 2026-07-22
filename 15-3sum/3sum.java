class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[l]+nums[i]+nums[r];
                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    ans.add(Arrays.asList(nums[l],nums[r],nums[i]));
                    l++;
                    r--;
                while(l<r && nums[l]==nums[l-1]) l++;
                }
            }
        }
        return ans;
    }
}