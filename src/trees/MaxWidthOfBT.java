package trees;

import utils.PNode;

import java.util.Stack;

/**
 * Created by vineet on 9/24/14.
 */
public class MaxWidthOfBT {

  public static int getMaxWidth(PNode root){
    Stack<PNode> s1 = new Stack<PNode>();
    Stack<PNode> s2 = new Stack<PNode>();

    int maxWidth = 0;
    s1.push(root);
    while(!s1.empty() || !s2.empty()){
      if(maxWidth < s1.size())
        maxWidth = s1.size();

      while(!s1.empty()){
        PNode temp = s1.pop();
        s2.push(temp.getLeft());
        s2.push(temp.getRight());
      }

      if(maxWidth < s2.size())
        maxWidth = s2.size();

      while(!s2.empty()){
        PNode temp = s2.pop();
        s1.push(temp.getRight());
        s1.push(temp.getLeft());
      }

    }

    return maxWidth;

  }
}
