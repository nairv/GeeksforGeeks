package utils;

/**
 * Created by vineet on 9/8/14.
 * Trie implementation:
 * Assumptions: Only case insensitive alphabetic characters are allowed
 * You can search for whole words or prefixes of inserted words based on the mode.
 */

class Node{
  Node[] children;
  char data;
  boolean isTerminating = false;

  Node(char data){
    this.data = data;
    this.isTerminating = false;
    children = new Node[26];
  }

  char getChar(){
    return data;
  }

}
public class Trie {

  static Node rootNode;
  private Mode mode;

  public enum Mode{
    WHOLE_WORD,
    PARTIAL_WORD;
  }

  public void setMode(Mode m){
    this.mode = m;
  }


  Trie(){
    rootNode = new Node(' ');
    setMode(Mode.WHOLE_WORD);
  }

  public void insertWord(String word){
    char[] arr = word.toUpperCase().toCharArray();
    Node temp = rootNode;

    for (char c: arr){
      int arrayIndex = c-'A';
      if(temp.children[arrayIndex] != null){
        temp = temp.children[arrayIndex];
      }
      else{
        temp.children[arrayIndex] = new Node(c);
        temp = temp.children[arrayIndex];
      }
    }
    temp.isTerminating = true;
  }


  public boolean searchWord(String word){
    char[] arr = word.toUpperCase().toCharArray();
    Node temp = rootNode;
    for (char c: arr){
      int arrayIndex = c-'A';
      if(temp.children[arrayIndex] != null){
        temp = temp.children[arrayIndex];
      }
      else{
        return false;
      }
    }

    if(this.mode == Mode.WHOLE_WORD){
      if(temp.isTerminating){
        return true;
      }
      else
        return false;
    }
    else{
      return true;
    }
  }


  public static void main(String args[]){
    Trie t = new Trie();
    t.setMode(Mode.WHOLE_WORD);
    t.insertWord("Vineet");
    t.insertWord("Vinod");
    System.out.println(t.searchWord("vineet"));
    System.out.println(t.searchWord("vin"));

    t.setMode(Mode.PARTIAL_WORD);
    System.out.println(t.searchWord("vin"));
  }
}
