/**
 * leetcode 208 题，实现一个 Tire（前缀树）
 * 思路：利用字符串之间的公公前缀，将重复的前缀合并在一起。
 */
class TrieNode {
	// 因为 Trie 类要访问 TrieNode 类的数据，所以设为 public。
	public char data;
	public TrieNode[] children = new TrieNode[26];
	public boolean isEndingChar = false;
	public TrieNode(char data) {
		this.data = data;
	}
}
class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode('/'); // 根节点存储 '/'
	}
	/** Inserts a word into the tire. */
	public void insert(String word) {
		TrieNode p = root;
		char[] text = word.toCharArray();
		for(int i = 0; i< text.length; i++) {
			int index = text[i] - 'a';
			if(p.children[index] == null ) {	
				p.children[index] = new TrieNode(text[i]);
			}
			p = p.children[index];
		}
		p.isEndingChar = true;
	}
	public boolean search(String word) {

		TrieNode p = root;
		char[] text = word.toCharArray();
		for(int i = 0; i<text.length; i++) {
			int index = text[i] - 'a';
			if(p.children[index] == null) {
				return false;
			}
			p = p.children[index];
		}
		return p.isEndingChar;
	}
	public boolean startsWith(String prefix) {
		TrieNode p = root;
		char[] text = prefix.toCharArray();
		for(int i = 0; i<text.length; i++) {
			int index = text[i] - 'a';
			if(p.children[index] == null) {
				return false;
			}
			p = p.children[index];
		}
		return true;
	}
}
