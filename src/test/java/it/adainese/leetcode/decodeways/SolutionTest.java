package it.adainese.leetcode.decodeways;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void numDecodings_1() {
    assertThat(new Solution().numDecodings("12")).isEqualTo(2);
  }

  @Test
  void numDecodings_2() {
    assertThat(new Solution().numDecodings("226")).isEqualTo(3);
  }

  @Test
  void numDecodings_3() {
    assertThat(new Solution().numDecodings("06")).isEqualTo(0);
  }

  @Test
  void numDecodings_4() {
    assertThat(new Solution().numDecodings("12121")).isEqualTo(8);
  }

  @Test
  void numDecodings_5() {
    assertThat(new Solution().numDecodings("20419")).isEqualTo(2);
  }

  @Test
  void numDecodings_6() {
    assertThat(new Solution().numDecodings("9012")).isEqualTo(0);
  }
}
