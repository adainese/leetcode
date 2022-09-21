package it.adainese.leetcode.sumofevennumbersafterqueries;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test_01() {
    // nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
    var nums = intArray(1, 2, 3, 4);
    var queries = new int[][]{intArray(1, 0), intArray(-3, 1), intArray(-4, 0), intArray(2, 3)};
    assertThat(new Solution().sumEvenAfterQueries(nums, queries)).containsExactly(8, 6, 2, 4);
  }

  @Test
  void test_02() {
    var nums = intArray(1);
    var queries = new int[][]{intArray(4, 0)};
    assertThat(new Solution().sumEvenAfterQueries(nums, queries)).containsExactly(0);
  }

  int[] intArray(int... items) {
    return items;
  }
}
