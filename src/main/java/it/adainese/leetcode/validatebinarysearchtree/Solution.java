package it.adainese.leetcode.validatebinarysearchtree;

import it.adainese.leetcode.common.TreeNode;
import it.adainese.leetcode.metadata.TopicTag;

// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/
// Tree
// Depth-First Search
// Binary Search Tree
// Binary Tree
@TopicTag("Tree")
class Solution {

  static class Result {

    boolean valid;
    int min;
    int max;

    Result() {
    }

    Result(boolean valid) {
      this.valid = valid;
    }

    public Result(boolean valid, int min, int max) {
      this.valid = valid;
      this.min = min;
      this.max = max;
    }
  }

  public boolean isValidBST(TreeNode root) {
    return isValid(root).valid;
  }

  Result isValid(TreeNode node) {

    int min = node.val;
    int max = node.val;

    if (null != node.left) {
      if (node.left.val >= min) {
        return new Result(false);
      }
      min = node.left.val;
    }

    if (null != node.right) {
      if (node.right.val <= max) {
        return new Result(false);
      }
      max = node.right.val;
    }

    if (null != node.left) {
      Result resLeft = isValid(node.left);
      if (!resLeft.valid || node.val <= resLeft.max) {
        return new Result(false);
      }
      min = Math.min(min, resLeft.min);
      max = Math.max(max, resLeft.max);
    }

    if (null != node.right) {
      Result resRight = isValid(node.right);
      if (!resRight.valid || node.val >= resRight.min) {
        return new Result(false);
      }
      min = Math.min(min, resRight.min);
      max = Math.max(max, resRight.max);
    }

    return new Result(true, min, max);
  }
}
