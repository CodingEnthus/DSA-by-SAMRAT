class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,ans,0);
        return ans;
    }
    void solve(int[] nums,List<List<Integer>> ans,int Start){
        if(Start==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
          HashSet<Integer> set=new HashSet<>();
        for(int i=Start;i<nums.length;i++){
          
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                swap(nums,Start,i);
                solve(nums,ans,Start+1);
                  swap(nums,Start,i);
            }
        }
    }
    void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}