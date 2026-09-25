class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] l=new int[n];
        int[] r=new int[n];
        int ans=0;
        l[0]=height[0];
        r[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            l[i]=Math.max(height[i],l[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(height[i],r[i+1]);
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(l[i],r[i])-height[i];
        }
        return ans;
        
    }
}

//L-0 1 1 2 2 2 2 3 3 3 3 3 
//R-3 3 3 3 3 3 3 3 2 2 2 1 
//m -0 1 1 2 2 2 2 3 2 2 2 1
// I-0 1 0 2 1 0 1 3 2 1 2 1 


// ans-0 1  1+1+2+1+1
// maxans=0 1