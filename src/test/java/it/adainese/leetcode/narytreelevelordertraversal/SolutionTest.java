package it.adainese.leetcode.narytreelevelordertraversal;


import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.Node;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void levelOrder_1() {
    Node root = new Node(1, List.of(
        new Node(3, List.of(
            new Node(5),
            new Node(6)
        )),
        new Node(2),
        new Node(4)
    )
    );

    var actual = new Solution().levelOrder(root).stream().flatMap(List::stream).toList();

    assertThat(actual).containsExactly(1, 3, 2, 4, 5, 6);
  }

}
