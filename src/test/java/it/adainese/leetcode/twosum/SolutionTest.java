package it.adainese.leetcode.twosum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void twoSum_1() {
    var sums = new int[]{2, 7, 11, 15};
    assertThat(new Solution().twoSum(sums, 9)).containsExactlyInAnyOrder(0, 1);
  }

  @Test
  void twoSum_2() {
    var sums = new int[]{3, 2, 4};
    assertThat(new Solution().twoSum(sums, 6)).containsExactlyInAnyOrder(1, 2);
  }

  @Test
  void twoSum_3() {
    var sums = new int[]{3, 3};
    assertThat(new Solution().twoSum(sums, 6)).containsExactlyInAnyOrder(0, 1);
  }

  @Test
  void twoSum_4() {
    var random = new Random();
    int limit = (int) 1e4;
    int max = (int) 1e9;
    var sums = random.ints(-max, max).limit(limit).toArray();
    var i = random.nextInt(limit);
    var j = random.nextInt(limit);
    var target = sums[i] + sums[j];

    assertThat(new Solution().twoSum(sums, target)).containsExactlyInAnyOrder(i, j);
  }
}
