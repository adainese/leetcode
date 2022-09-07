package it.adainese.leetcode.constructstringfrombinarytree;

import it.adainese.leetcode.common.TreeNode;

class Solution {

  public String tree2str(TreeNode root) {
    StringBuilder builder = new StringBuilder(String.valueOf(root.val));
    if (root.left != null || root.right != null) {
      builder.append("(");
      if (root.left != null) {
        builder.append(tree2str(root.left));
      }
      builder.append(")");
    }
    if (root.right != null) {
      builder.append("(")
          .append(tree2str(root.right))
          .append(")");
    }
    return builder.toString();
  }
}
