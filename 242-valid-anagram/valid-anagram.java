class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            if(map.get(t.charAt(i))==0){
                map.remove(t.charAt(i));
            }
        }
        return map.isEmpty();
    }
}