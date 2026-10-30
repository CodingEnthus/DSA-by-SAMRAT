class Trie {
    Trie[] children=new Trie[26];
        boolean isEnd=false;
    public Trie() {
        
    }
    public void insert(String word) {
        Trie root=this;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(root.children[idx]==null){
                Trie newNode=new Trie();
                root.children[idx]=newNode;
            }
                root=root.children[idx];
        }
        root.isEnd=true;
        
    }
    
    public boolean search(String word) {
        Trie root=this;
        for(char ch: word.toCharArray()){
            int idx=ch-'a';
            if(root.children[idx]==null){
                return false;
            }
            root=root.children[idx];
        }
        return root.isEnd;

        
    }
    
    public boolean startsWith(String prefix) {
        Trie root=this;
        for(char ch: prefix.toCharArray()){
            int idx=ch-'a';
            if(root.children[idx]==null) return false;
            root=root.children[idx];
        }

            return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */