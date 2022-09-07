package it.adainese.leetcode.constructstringfrombinarytree;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void tree2str_1() {
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
    assertThat(new Solution().tree2str(root)).isEqualTo("1(2(4))(3)");
  }

  @Test
  void tree2str_2() {
    TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
    assertThat(new Solution().tree2str(root)).isEqualTo("1(2()(4))(3)");
  }
}
