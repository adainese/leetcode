package it.adainese.leetcode.common;

import java.util.StringJoiner;

public class Printer {

  public static String print(TreeNode tree) {
    var joiner = new StringJoiner(",", "[", "]");
    if (null != tree) {
      joiner.add(String.valueOf(tree.val));
      printRec(joiner, tree);
    }
    return joiner.toString();
  }

  static void printRec(StringJoiner joiner, TreeNode tree) {
    if (null != tree) {
      if (null != tree.left) {
        joiner.add(String.valueOf(tree.left.val));
      } else {
        joiner.add(null);
      }

      if (null != tree.right) {
        joiner.add(String.valueOf(tree.right.val));
      } else {
        joiner.add(null);
      }

      printRec(joiner, tree.left);
      printRec(joiner, tree.right);
    }
  }

}
