package it.adainese.leetcode.binarytreeinordertraversal;

import it.adainese.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

  public List<Integer> inorderTraversal_recursive(TreeNode root) {
    var inOrderList = new ArrayList<Integer>();
    helper(root, inOrderList);
    return inOrderList;
  }

  private void helper(TreeNode current, List<Integer> acc) {
    if (current != null) {
      helper(current.left, acc);
      acc.add(current.val);
      helper(current.right, acc);
    }
  }

  public List<Integer> inorderTraversal_iterative(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }
      curr = stack.pop();
      res.add(curr.val);
      curr = curr.right;
    }
    return res;
  }

  // Morris Traversal https://stackoverflow.com/questions/5502916/explain-morris-inorder-tree-traversal-without-using-stacks-or-recursion
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    TreeNode curr = root;
    TreeNode pre;
    while (curr != null) {
      if (curr.left == null) {
        res.add(curr.val);
        curr = curr.right; // move to next right node
      } else { // has a left subtree
        pre = curr.left;
        while (pre.right != null) { // find rightmost
          pre = pre.right;
        }
        pre.right = curr; // put cur after the pre node
        TreeNode temp = curr; // store cur node
        curr = curr.left; // move cur to the top of the new tree
        temp.left = null; // original cur left be null, avoid infinite loops
      }
    }
    return res;
  }
}
