package it.adainese.leetcode.uniquebinarysearchtrees.ii;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.Printer;
import org.junit.jupiter.api.Test;

class RecursiveSolutionTest {

  @Test
  void generateTrees_1() {
    var actual = new Solution().generateTrees(1);
    assertThat(actual).hasSize(1);
    assertThat(actual.get(0)).extracting("val").isEqualTo(1);
  }

  @Test
  void generateTrees_2() {
    var actual = new Solution().generateTrees(2);
    assertThat(actual).hasSize(2);
    //assertThat(actual).extracting("val").isEqualTo(1);
    actual.stream().map(Printer::print).forEach(System.out::println);
  }

  @Test
  void generateTrees_3() {
    var actual = new Solution().generateTrees(3);
    actual.stream().map(Printer::print).forEach(System.out::println);
    assertThat(actual).hasSize(5);
    //assertThat(actual).extracting("val").isEqualTo(1);
  }

  @Test
  void generateTrees_4() {
    var actual = new Solution().generateTrees(4);
    actual.stream().map(Printer::print).forEach(System.out::println);
    assertThat(actual).hasSize(5);
    //assertThat(actual).extracting("val").isEqualTo(1);
  }
}
