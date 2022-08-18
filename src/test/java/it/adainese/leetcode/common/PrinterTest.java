package it.adainese.leetcode.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PrinterTest {

  @Test
  void printTree_1() {

    var root = new TreeNode(0,
        new TreeNode(-3,
            new TreeNode(-10),
            null),
        new TreeNode(9,
            new TreeNode(5),
            null));

    var actual = Printer.print(root);
    System.out.println(actual);
    assertThat(actual).isEqualTo("[0,-3,9,-10,null,5]");

  }

  @Test
  void printTree_2() {
    var root = new TreeNode(0,
        new TreeNode(-10,
            null,
            new TreeNode(-3)),
        new TreeNode(5,
            null,
            new TreeNode(9)));

    var actual = Printer.print(root);
    System.out.println(actual);
    assertThat(actual).isEqualTo("[0,-10,5,null,-3,null,9]");
  }

  @Test
  void printTree_3() {
    var root = new TreeNode(3,
        new TreeNode(1),
        null);
    var actual = Printer.print(root);
    System.out.println(actual);
    assertThat(actual).isEqualTo("[3,1]");
  }

  @Test
  void printTree_4() {
    var root = new TreeNode(1,
        null,
        new TreeNode(3));
    var actual = Printer.print(root);
    System.out.println(actual);
    assertThat(actual).isEqualTo("[1,null,3]");
  }
}
