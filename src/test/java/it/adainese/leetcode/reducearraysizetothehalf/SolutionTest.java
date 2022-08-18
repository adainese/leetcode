package it.adainese.leetcode.reducearraysizetothehalf;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void minSetSize_1() {
    var arr = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
    assertThat(new Solution().minSetSize(arr)).isEqualTo(2);
  }

  @Test
  void minSetSize_2() {
    var arr = new int[]{7, 7, 7, 7, 7, 7};
    assertThat(new Solution().minSetSize(arr)).isEqualTo(1);
  }
}
