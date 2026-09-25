class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int i=0;
        int j=1;
        while(j<n){
            if(prices[i]<prices[j]){
                maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
                
            }else{
                i=j;
                
            }
            j++;
            
        }
        return maxProfit;
    }
}
