class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        int[] ans=new int[k];
        for(int x:nums){
            Map.put(x,Map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> a.getValue()- b.getValue());
        for(Map.Entry<Integer,Integer> entry:Map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().getKey();
        }
        return ans;

        


    }
}