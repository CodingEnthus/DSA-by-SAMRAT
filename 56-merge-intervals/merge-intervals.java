class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       int low=intervals[0][0];
        int high=intervals[0][1];
        
             List<int[]> result=new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
   
        for(int i=1;i<intervals.length;i++){
             
            if(intervals[i][0]<=high){
                high=Math.max(high,intervals[i][1]);
            }else{
               result.add(new int[]{low,high});
                low=intervals[i][0];
                high=Math.max(high,intervals[i][1]);
            }
             
        }
        result.add(new int[]{low,high});
        return result.toArray(new int[result.size()][]);
        
    }
}