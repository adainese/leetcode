package it.adainese.leetcode.binarytreepruning;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.Printer;
import it.adainese.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void pruneTree_1() {
    var root = new TreeNode(1, null, new TreeNode(0, new TreeNode(0), new TreeNode(1)));
    var actual = new Solution().pruneTree(root);

    assertThat(Printer.print(actual)).isEqualTo("[1,null,0,null,1]");
  }

}
