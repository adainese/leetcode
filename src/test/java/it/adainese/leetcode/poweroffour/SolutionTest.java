package it.adainese.leetcode.poweroffour;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPowerOfFour_16() {
    assertThat(new Solution().isPowerOfFour(16)).isTrue();
    assertThat(new Solution().isPowerOfFourNoLoop(16)).isTrue();
  }

  @Test
  void isPowerOfFour_5() {
    assertThat(new Solution().isPowerOfFour(5)).isFalse();
    assertThat(new Solution().isPowerOfFourNoLoop(5)).isFalse();
  }

  @Test
  void isPowerOfFour_1() {
    assertThat(new Solution().isPowerOfFour(1)).isTrue();
    assertThat(new Solution().isPowerOfFourNoLoop(1)).isTrue();
  }

  @Test
  void isPowerOfFour_0() {
    assertThat(new Solution().isPowerOfFour(0)).isFalse();
    assertThat(new Solution().isPowerOfFourNoLoop(0)).isFalse();
  }

  @Test
  void isPowerOfFour_neg4() {
    assertThat(new Solution().isPowerOfFour(-4)).isFalse();
    assertThat(new Solution().isPowerOfFourNoLoop(-4)).isFalse();
  }

  @Test
  void isPowerOfFour_allPos() {
    var dut = new Solution();

    for (int n = 1; n < Integer.MAX_VALUE; n++) {
      boolean expected = ((n == 1)
          || (n == 4)
          || (n == 16)
          || (n == 64)
          || (n == 256)
          || (n == 1024)
          || (n == 4096)
          || (n == 16384)
          || (n == 65536)
          || (n == 262144)
          || (n == 1048576)
          || (n == 4194304)
          || (n == 16777216)
          || (n == 67108864)
          || (n == 268435456)
          || (n == 1073741824)
      );
      assertThat(dut.isPowerOfFourNoLoop(n)).isEqualTo(expected);
    }

  }

  @Test
  void isPowerOfFour_timed() {
    var dut = new Solution();
    long startTime = System.nanoTime();
    for (int n = 1; n < Integer.MAX_VALUE; n++) {
      dut.isPowerOfFourNoLoop(n);
    }
    long endTime = System.nanoTime();
    System.out.println(endTime - startTime);
  }

}
