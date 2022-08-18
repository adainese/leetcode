package it.adainese.leetcode.uniquebinarysearchtrees.ii;

import it.adainese.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<TreeNode> generateTrees(int n) {

    if (n == 0) {
      return List.of();
    }

    if (n == 1) {
      return List.of(new TreeNode(1));
    }

    return addN(generateTrees(n -1), n);

  }

  List<TreeNode> addN(List<TreeNode> previous, int n) {
    List<TreeNode> result = new ArrayList<>();
    for (TreeNode tree: previous) {
      result.add(new TreeNode(n, tree, null));

      TreeNode current = tree;

      while(current != null) {
        result.add(copyTree(tree, current.val, n));
        current = current.right;
      }

    }

    return result;
  }

  private TreeNode copyTree(TreeNode tree, int val, int n) {
    if (null == tree) {
      return null;
    }
    if (val == tree.val) {
      TreeNode nthNode = new TreeNode(n, copyTree(tree.right, val, n), null);
      return new TreeNode(tree.val, copyTree(tree.left, val, n), nthNode);
    } else {
      return new TreeNode(tree.val, copyTree(tree.left, val, n), copyTree(tree.right, val, n));
    }
  }

}
