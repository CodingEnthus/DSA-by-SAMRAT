class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxNum(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalHours(piles,mid)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    int maxNum(int arr[]){
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(arr[i],ans);
        }
        return ans;
    }
    int totalHours(int[] arr,int k){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans+=Math.ceil((double)arr[i]/(double)k);
        }
        return ans;
    }
}