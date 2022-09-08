package it.adainese.leetcode.binarytreeinordertraversal;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void inorderTraversal_1() {
    TreeNode root = new TreeNode(1,
        null,
        new TreeNode(2,
            new TreeNode(3),
            null)
    );
    assertThat(new Solution().inorderTraversal(root)).containsExactly(1, 3, 2);
  }

  @Test
  void inorderTraversal_2() {
    assertThat(new Solution().inorderTraversal(null)).isNotNull().isEmpty();
  }

  @Test
  void inorderTraversal_3() {
    TreeNode root = new TreeNode(1);
    assertThat(new Solution().inorderTraversal(root)).containsExactly(1);
  }

  @Test
  void inorderTraversal_4() {
    TreeNode root = new TreeNode(6,
        new TreeNode(2,
            new TreeNode(1),
            new TreeNode(4,
                new TreeNode(3),
                new TreeNode(5)
            )
        ),
        new TreeNode(7,
            null,
            new TreeNode(9,
                new TreeNode(8),
                null
            )
        )
    );
    assertThat(new Solution().inorderTraversal(root)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
  }
}
