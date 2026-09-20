class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int need=target-(nums[i]);
            if(!map.containsKey(need)){
                map.put(nums[i],i);
            }else{
                return new int[]{i,map.get(need)};
            }
        }
        return new int[]{0,0};
    }
}

