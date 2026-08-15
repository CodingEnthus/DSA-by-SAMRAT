class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       int n=strs.length;
       List<List<String>> ans=new ArrayList<>();
       HashMap<String,List<String>> map=new HashMap<>();
       for(String str:strs){
          char[] ch=str.toCharArray();
          Arrays.sort(ch);
          String s=new String(ch);
          if(!map.containsKey(s)){
            map.put(s,new ArrayList<>());
          }
          map.get(s).add(str);
       }
       for(Map.Entry<String,List<String>> entry:map.entrySet()) {
        List<String> value=entry.getValue();
        ans.add(value);
       }
    
       
       return ans;
       
    }
}