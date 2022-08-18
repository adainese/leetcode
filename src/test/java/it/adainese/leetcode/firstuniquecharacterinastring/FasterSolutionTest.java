package it.adainese.leetcode.firstuniquecharacterinastring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FasterSolutionTest {

  @Test
  void firstUniqChar_1() {
    assertThat(new FasterSolution().firstUniqChar("leetcode")).isEqualTo(0);
  }

  @Test
  void firstUniqChar_2() {
    assertThat(new FasterSolution().firstUniqChar("loveleetcode")).isEqualTo(2);
  }

  @Test
  void firstUniqChar_3() {
    assertThat(new FasterSolution().firstUniqChar("aabb")).isEqualTo(-1);
  }

  @Test
  void firstUniqChar_4() {
    assertThat(new FasterSolution().firstUniqChar("aadadaad")).isEqualTo(-1);
  }
}
