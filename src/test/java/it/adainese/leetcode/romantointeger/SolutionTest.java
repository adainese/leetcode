package it.adainese.leetcode.romantointeger;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void romanToInt_3() {
    assertThat(new Solution().romanToInt("III")).isEqualTo(3);

  }

  @Test
  void romanToInt_58() {
    assertThat(new Solution().romanToInt("LVIII")).isEqualTo(58);

  }

  @Test
  void romanToInt_1994() {
    assertThat(new Solution().romanToInt("MCMXCIV")).isEqualTo(1994);

  }

}
