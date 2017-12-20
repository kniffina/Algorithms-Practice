import java.util.HashMap;

public class Trie {
    private TrieNode root;

    // Implement these methods :
    public Trie() {
        this.root = new TrieNode();
    }

    public void insertWord(String word) {
        if(word == null || word.length() < 1) return;
        TrieNode curr = root;

        HashMap<Character, TrieNode> children = curr.children;

        for(int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if(children.containsKey(c)) {
                curr = children.get(c);
            } else {
                TrieNode n = new TrieNode(c);
                children.put(c, n);
                curr = n;
            }
            children = curr.children;

            if(i == word.length() - 1) {
                curr.isLeaf = true;
            }
        }
    }
    public Boolean searchWord(String word) {
        TrieNode curr = root;
        HashMap<Character, TrieNode> children = curr.children;

        for(int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if(children.containsKey(c)) {
                curr = children.get(c);
                children = curr.children;
            } else {
                return false;
            }
        }
        return curr.isLeaf;
    }
    public Boolean searchPrefix(String word) {
        TrieNode curr = root;
        HashMap<Character, TrieNode> children = curr.children;

        for(int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if(children.containsKey(c)) {
                curr = children.get(c);
                children = curr.children;
            } else {
                return false;
            }
        }
        return true;
    }
}
