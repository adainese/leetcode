package it.adainese.leetcode.uniquemorsecodewords;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void uniqueMorseRepresentations_1() {
    var words = new String[]{"gin", "zen", "gig", "msg"};
    assertThat(new Solution().uniqueMorseRepresentations(words)).isEqualTo(2);
  }

  @Test
  void uniqueMorseRepresentations_2() {
    var words = new String[]{"a"};
    assertThat(new Solution().uniqueMorseRepresentations(words)).isEqualTo(1);
  }
}
