package it.adainese.leetcode.validatebinarysearchtree;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class RecursiveSolutionTest {

  @Test
  void isValidBST_1() {
    TreeNode tree = new TreeNode(2,
        new TreeNode(1),
        new TreeNode(3)
    );
    assertThat(new Solution().isValidBST(tree)).isTrue();
  }

  @Test
  void isValidBST_2() {
    TreeNode tree = new TreeNode(5,
        new TreeNode(1),
        new TreeNode(4,
            new TreeNode(3),
            new TreeNode(6))
    );
    assertThat(new Solution().isValidBST(tree)).isFalse();
  }

  @Test
  void isValidBST_3() {
    TreeNode tree = new TreeNode(3,
        new TreeNode(1,
            new TreeNode(0),
            new TreeNode(2)
        ),
        new TreeNode(5,
            new TreeNode(4),
            new TreeNode(6,
                null,
                new TreeNode(3))
        )
    );
    assertThat(new Solution().isValidBST(tree)).isFalse();
  }
}
