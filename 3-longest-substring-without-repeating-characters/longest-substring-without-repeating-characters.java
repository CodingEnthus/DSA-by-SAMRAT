class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1) return s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int i=0;
        int maxLength=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j))+1);

            }
            map.put(s.charAt(j),j);
            maxLength=Math.max(maxLength,j-i+1);
        }
        return maxLength;
    }
}
