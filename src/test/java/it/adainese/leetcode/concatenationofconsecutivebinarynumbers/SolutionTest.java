package it.adainese.leetcode.concatenationofconsecutivebinarynumbers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void concatenatedBinary_1() {
    assertThat(new Solution().concatenatedBinary(1)).isEqualTo(1);
  }

  @Test
  void concatenatedBinary_3() {
    assertThat(new Solution().concatenatedBinary(3)).isEqualTo(27);
  }

  @Test
  void concatenatedBinary_12() {
    assertThat(new Solution().concatenatedBinary(12)).isEqualTo(505379714);
  }
}
