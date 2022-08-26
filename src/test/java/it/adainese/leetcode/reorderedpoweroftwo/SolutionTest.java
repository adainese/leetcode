package it.adainese.leetcode.reorderedpoweroftwo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void reorderedPowerOf2_1() {
    assertThat(new Solution().reorderedPowerOf2(1)).isTrue();
  }

  @Test
  void reorderedPowerOf2_10() {
    assertThat(new Solution().reorderedPowerOf2(10)).isFalse();
  }

  @Test
  void reorderedPowerOf2_2410() {
    assertThat(new Solution().reorderedPowerOf2(2401)).isTrue();
  }
}
