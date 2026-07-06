class Solution {
    int maxElement(int[] arr){
        int max=arr[0];
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    int totalHours(int[] arr,int k){
        int hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=Math.ceil(arr[i]+k-1)/k;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxElement(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalH=totalHours(piles,mid);
            if(totalH<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}