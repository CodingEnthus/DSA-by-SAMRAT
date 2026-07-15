class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
        prefix=new int[nums.length+1];
        int n=nums.length;
        int s=0;
        
        for(int i=0;i<n;i++){
            prefix[i+1]=nums[i]+prefix[i];
        }
    }
    
    public int sumRange(int l, int r) {
        return prefix[r+1]-prefix[l];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */