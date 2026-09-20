class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] ans=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
        
    }
}

// 3 2 1 4 5 I/O
// 40 60 120 30 24 O/P

// 3 2 1 4 5

// L=1   3  6 6 24
// R=40 20 20 5 1

// ans= 40 60 120 30 24