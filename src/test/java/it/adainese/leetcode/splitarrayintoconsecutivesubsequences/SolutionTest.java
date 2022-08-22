package it.adainese.leetcode.splitarrayintoconsecutivesubsequences;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPossible_1() {
    var nums = new int[]{1, 2, 3, 3, 4, 5};
    assertThat(new Solution().isPossible(nums)).isTrue();
  }

  @Test
  void isPossible_2() {
    var nums = new int[]{1, 2, 3, 3, 4, 5};
    assertThat(new Solution().isPossible(nums)).isTrue();
  }

  @Test
  void isPossible_3() {
    var nums = new int[]{1, 2, 3, 4, 4, 5};
    assertThat(new Solution().isPossible(nums)).isFalse();
  }

  @Test
  void isPossible_4() {
    var nums = new int[]{1, 2, 3};
    assertThat(new Solution().isPossible(nums)).isTrue();
  }

  @Test
  void isPossible_5() {
    var nums = new int[]{2, 3, 3, 5, 6, 6, 7, 8, 9, 10};
    assertThat(new Solution().isPossible(nums)).isFalse();
  }

  @Test
  void isPossible_6() {
    var nums = new int[]{1, 2, 3, 3, 4, 4, 5, 5};
    assertThat(new Solution().isPossible(nums)).isTrue();
  }
}
