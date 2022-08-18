package it.adainese.leetcode.lowestcommonancestorofabinarysearchtree;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  TreeNode tree1() {
    //root = [6,2,8,0,4,7,9,null,null,3,5]
    return new TreeNode(6,
        new TreeNode(2,
            new TreeNode(0),
            new TreeNode(4,
                new TreeNode(3),
                new TreeNode(5)
            )
        ),
        new TreeNode(8,
            new TreeNode(7),
            new TreeNode(9)
        )
    );
  }

  @Test
  void lowestCommonAncestor_1() {

    var root = tree1();
    var p = new TreeNode(2);
    var q = new TreeNode(4);

    assertThat(new RecursiveSolution().lowestCommonAncestor(root, p, q))
        .as("recursive")
        .isNotNull()
        .extracting("val").isEqualTo(2);
    assertThat(new IterativeSolution().lowestCommonAncestor(root, p, q))
        .as("iterative")
        .isNotNull()
        .extracting("val").isEqualTo(2);
  }

  @Test
  void lowestCommonAncestor_2() {

    var root = tree1();
    var p = new TreeNode(0);
    var q = new TreeNode(5);

    assertThat(new RecursiveSolution().lowestCommonAncestor(root, p, q)).isNotNull()
        .extracting("val")
        .isEqualTo(2);
  }

  @Test
  void lowestCommonAncestor_3() {

    var root = tree1();
    var p = new TreeNode(3);
    var q = new TreeNode(9);

    assertThat(new RecursiveSolution().lowestCommonAncestor(root, p, q)).isNotNull()
        .extracting("val")
        .isEqualTo(6);
  }
}
