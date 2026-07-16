class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int x:prefix){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}