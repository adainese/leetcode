package it.adainese.leetcode.common;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.StringJoiner;

public class Printer {

  public static String print(TreeNode tree) {
    var joiner = new StringJoiner(",", "[", "]");

    if (null != tree) {
      joiner.add(String.valueOf(tree.val));
      var list = new ArrayDeque<String>();
      printRec(list, tree);
      while (list.peekLast() == "null") {
        list.removeLast();
      }
      list.forEach(joiner::add);
    }
    return joiner.toString();
  }

  static void printRec(Collection<String> joiner, TreeNode tree) {
    if (null != tree) {
      if (null != tree.left) {
        joiner.add(String.valueOf(tree.left.val));
      } else {
        joiner.add("null");
      }

      if (null != tree.right) {
        joiner.add(String.valueOf(tree.right.val));
      } else {
        joiner.add("null");
      }

      printRec(joiner, tree.left);
      printRec(joiner, tree.right);
    }
  }

}
