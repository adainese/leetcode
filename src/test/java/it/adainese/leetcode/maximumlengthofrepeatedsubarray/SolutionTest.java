package it.adainese.leetcode.maximumlengthofrepeatedsubarray;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findLength_1() {
    var nums1 = new int[]{1, 2, 3, 2, 1};
    var nums2 = new int[]{3, 2, 1, 4, 7};
    assertThat(new Solution().findLength(nums1, nums2)).isEqualTo(3);
  }

  @Test
  void findLength_2() {
    var nums1 = new int[5];
    var nums2 = new int[5];
    assertThat(new Solution().findLength(nums1, nums2)).isEqualTo(5);
  }
}
