class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,ans,0);
        return ans;
    }
    void backtrack(int[] nums,List<List<Integer>> ans,int start){
        if(start==nums.length){
            List<Integer> current=new ArrayList<>();
            for(int num:nums){
                current.add(num);
            }
            ans.add(current);
        }
        for(int i=start;i<nums.length;i++){
        swap(i,nums,start);
        backtrack(nums,ans,start+1);
        swap(i,nums,start);
        }
    }
    void swap(int i,int[] nums,int start){
        int temp=nums[i];
        nums[i]=nums[start];
        nums[start]=temp;
    }
}