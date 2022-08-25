package it.adainese.leetcode.ransomnote;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void canConstruct_1() {
    assertThat(new Solution().canConstruct("a", "b")).isFalse();
  }

  @Test
  void canConstruct_2() {
    assertThat(new Solution().canConstruct("aa", "ab")).isFalse();
  }

  @Test
  void canConstruct_3() {
    assertThat(new Solution().canConstruct("aa", "aab")).isTrue();
  }
}
