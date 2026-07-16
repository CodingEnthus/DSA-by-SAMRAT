import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            p+=nums[i];
            if(map.containsKey(p-k)){
                c+=map.get(p-k);
            }
            map.put(p,map.getOrDefault(p,0)+1);
        }
        return c;
    }
}