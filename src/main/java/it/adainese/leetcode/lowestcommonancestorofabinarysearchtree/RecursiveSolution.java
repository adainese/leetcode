package it.adainese.leetcode.lowestcommonancestorofabinarysearchtree;

import it.adainese.leetcode.common.TreeNode;

class RecursiveSolution {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int lower, upper;
    if (p.val < q.val) {
      lower = p.val;
      upper = q.val;
    } else {
      lower = q.val;
      upper = p.val;
    }
    return helper(root, lower, upper);
  }

  TreeNode helper(TreeNode node, int lower, int upper) {

    if (lower <= node.val) {
      if (upper < node.val) {
        return helper(node.left, lower, upper);
      } else {
        return node;
      }
    } else {
      return helper(node.right, lower, upper);
    }

  }
}
