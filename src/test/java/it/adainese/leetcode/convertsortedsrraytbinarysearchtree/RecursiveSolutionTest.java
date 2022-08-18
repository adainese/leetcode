package it.adainese.leetcode.convertsortedsrraytbinarysearchtree;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.Printer;
import org.junit.jupiter.api.Test;

class RecursiveSolutionTest {

  @Test
  void sortedArrayToBST_1() {
    var actual = new Solution().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    String printed = Printer.print(actual);
    System.out.println(printed);
    assertThat(actual).isNotNull();
    assertThat(printed).isIn("[0,-3,9,-10,null,5]", "[0,-10,5,null,-3,null,9]");
  }

  @Test
  void sortedArrayToBST_2() {
    var actual = new Solution().sortedArrayToBST(new int[]{1, 3});
    String printed = Printer.print(actual);
    System.out.println(printed);
    assertThat(actual).isNotNull();
    assertThat(printed).isIn("[1,null,3]", "[3,1]");
  }
}
