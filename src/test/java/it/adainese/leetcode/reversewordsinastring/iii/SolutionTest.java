package it.adainese.leetcode.reversewordsinastring.iii;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void reverseWords_01() {
    assertThat(new Solution().reverseWords("Let's take LeetCode contest")).isEqualTo(
        "s'teL ekat edoCteeL tsetnoc");
  }

  @Test
  void reverseWords_02() {
    assertThat(new Solution().reverseWords("God Ding")).isEqualTo("doG gniD");
  }
}
