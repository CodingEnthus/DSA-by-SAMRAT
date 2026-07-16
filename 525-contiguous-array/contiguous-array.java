class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxLen=0;
        int sum=0;
        int n=nums.length;
        int len=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}