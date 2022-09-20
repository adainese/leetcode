package it.adainese.leetcode.utf8validation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void validUtf8_1() {
    var valid = new int[]{197, 130, 1};
    assertThat(new Solution().validUtf8(valid)).isTrue();
  }

  @Test
  void validUtf8_2() {
    var valid = new int[]{235, 140, 4};
    assertThat(new Solution().validUtf8(valid)).isFalse();
  }

}
