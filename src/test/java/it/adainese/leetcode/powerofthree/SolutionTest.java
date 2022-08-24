package it.adainese.leetcode.powerofthree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPowerOfThree_9() {
    assertThat(new Solution().isPowerOfThree(9)).isTrue();
  }

  @Test
  void isPowerOfThree_0() {
    assertThat(new Solution().isPowerOfThree(0)).isFalse();
  }

  @Test
  void isPowerOfThree_27() {
    assertThat(new Solution().isPowerOfThree(27)).isTrue();
  }

  @Test
  void isPowerOfThree_1() {
    assertThat(new Solution().isPowerOfThree(1)).isTrue();
  }
  
  @Test
  void isPowerOfThree_18() {
    assertThat(new Solution().isPowerOfThree(18)).isFalse();
  }

  @Test
  void isPowerOfThree_neg9() {
    assertThat(new Solution().isPowerOfThree(-9)).isFalse();
  }
}
