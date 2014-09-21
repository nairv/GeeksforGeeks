package trees;

/**
 * Created by vineet on 7/16/14.
 */
public class Trie {
  class TrieNode{
    char data;
    char[] children;

    TrieNode(char data){
      this.data = data;
      children = new char[26];
    }

  }
  public void insertWord(String word){
    char[] cword = word.toCharArray();
    System.out.println(cword.length);
  }

}
