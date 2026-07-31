/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            boolean result=isBadVersion(mid);
            if(!result){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}