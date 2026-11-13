class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,ans,target,new ArrayList<>(),0);
        return ans;
    }
    void solve(int[] candidates,List<List<Integer>> ans,int remain,List<Integer> temp,int start){
        if(remain==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>remain){
                break;
            }
            temp.add(candidates[i]);
            solve(candidates,ans,remain-candidates[i],temp,i);
            temp.remove(temp.size()-1);

        }

    }

}