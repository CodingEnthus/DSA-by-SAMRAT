class Solution {
    public List<Integer> partitionLabels(String s) {
        int end=Integer.MIN_VALUE;
        int start=0;
        List<Integer> ans=new ArrayList<>();
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(i==end){
                ans.add(end+1-start);
                start=end+1;
            }
        }
        //System.out.println('z'-'a');
        return ans;
    }
}