class Solution {
public:
    bool isAnagram(string s, string t) {
    unordered_map<char,int> m;
    if(s.size()!=t.size()){
        return false;
    }
    for(char c:s){
        m[c]++;
    }
    for(char c:t){
        if(m.find(c)==m.end()){
            return false;

        }
        else{
            if(m[c]==0){
                return false;
            }
            else{
                m[c]--;
            }
        }
    }
    return true;
        
    }
};