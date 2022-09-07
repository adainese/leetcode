package it.adainese.leetcode.binarytreepruning;

import it.adainese.leetcode.common.TreeNode;

class Solution {

  public TreeNode pruneTree(TreeNode root) {

    root.left = null == root.left ? null : pruneTree(root.left);
    root.right = null == root.right ? null : pruneTree(root.right);

    if (null == root.left && null == root.right) {
      return root.val == 0 ? null : root;
    }

    return root;
  }


}
