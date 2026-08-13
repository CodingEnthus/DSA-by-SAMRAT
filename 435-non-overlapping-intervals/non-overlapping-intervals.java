class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int previousEnd=Integer.MIN_VALUE;
        int kept=0;
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        for(int[] interval:intervals){
            if(interval[0]>=previousEnd){
                kept+=1;
                previousEnd=interval[1];
            }
            
        }
        return n-kept;
    }
}