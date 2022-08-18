package it.adainese.leetcode.kthsymbolingrammar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RecursiveSolutionTest {

  @Test
  void kthGrammar1() {
    assertThat(new Solution().kthGrammar(1, 1)).isEqualTo(0);
  }

  @Test
  void kthGrammar2() {
    assertThat(new Solution().kthGrammar(2, 1)).isEqualTo(0);
  }

  @Test
  void kthGrammar3() {
    assertThat(new Solution().kthGrammar(2, 2)).isEqualTo(1);
  }

  @Test
  void kthGrammar4() {
    assertThat(new Solution().kthGrammar(4, 5)).isEqualTo(1);
  }

  @Test
  void kthGrammar5() {
    assertThat(new Solution().kthGrammar(5, 10)).isEqualTo(0);
  }

  @Test
  void kthGrammar6() {
    assertThat(new Solution().kthGrammar(3, 3)).isEqualTo(1);
  }
}
