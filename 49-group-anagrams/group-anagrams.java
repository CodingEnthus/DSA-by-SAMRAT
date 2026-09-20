class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedString= new String(ch);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(str);
            }else{
                map.put(sortedString,new ArrayList<>());
                map.get(sortedString).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}