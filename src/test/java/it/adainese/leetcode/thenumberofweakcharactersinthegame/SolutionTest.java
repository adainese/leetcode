package it.adainese.leetcode.thenumberofweakcharactersinthegame;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test_01() {
    var props = new int[][]{
        new int[]{5, 5},
        new int[]{6, 3},
        new int[]{3, 6},
    };
    assertThat(new Solution().numberOfWeakCharacters(props)).isEqualTo(0);
  }

  @Test
  void test_02() {
    var props = new int[][]{
        new int[]{2, 2},
        new int[]{3, 3}
    };
    assertThat(new Solution().numberOfWeakCharacters(props)).isEqualTo(1);
  }

  @Test
  void test_03() {
    var props = new int[][]{
        new int[]{1, 5},
        new int[]{10, 4},
        new int[]{4, 3},
    };
    assertThat(new Solution().numberOfWeakCharacters(props)).isEqualTo(1);
  }
}
