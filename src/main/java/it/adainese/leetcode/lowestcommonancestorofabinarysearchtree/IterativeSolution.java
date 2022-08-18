package it.adainese.leetcode.lowestcommonancestorofabinarysearchtree;

import it.adainese.leetcode.common.TreeNode;

class IterativeSolution {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int lower, upper;
    if (p.val < q.val) {
      lower = p.val;
      upper = q.val;
    } else {
      lower = q.val;
      upper = p.val;
    }
    while (root.val < lower || root.val > upper) {
      root = root.val < lower ? root.right : root.left;
    }
    return root;
  }

}
