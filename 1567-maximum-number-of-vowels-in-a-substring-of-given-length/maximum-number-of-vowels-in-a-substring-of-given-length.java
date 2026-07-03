class Solution {
    boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int l=0;
        int r=k-1;
        int count=0;
        int maxcount=0;
        int n=s.length();
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxcount=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) count--;
             if(isVowel(s.charAt(i))) count++;
             maxcount=Math.max(count,maxcount);
        }
        return maxcount;
        

    }
}