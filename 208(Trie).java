class Trie {
    class TrieNode {
        boolean leaf;
        TrieNode[] trie = new TrieNode[26];
    }
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0;i < word.length();i ++) {
            int num = word.charAt(i) - 'a';
            if(node.trie[num] == null) node.trie[num] = new TrieNode();
            node = node.trie[num];
        }
        node.leaf = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0;i < word.length();i ++) {
            int num = word.charAt(i) - 'a';
            if(node.trie[num] == null) return false;
            node = node.trie[num];
        }
        return node.leaf;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0;i < prefix.length();i ++) {
            int num = prefix.charAt(i) - 'a';
            if(node.trie[num] == null) return false;
            node = node.trie[num];
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