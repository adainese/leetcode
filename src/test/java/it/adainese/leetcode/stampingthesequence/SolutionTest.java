package it.adainese.leetcode.stampingthesequence;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void movesToStamp() {
    assertThat(new Solution().movesToStamp("abc", "ababc")).hasSizeLessThanOrEqualTo(10);
  }

}
