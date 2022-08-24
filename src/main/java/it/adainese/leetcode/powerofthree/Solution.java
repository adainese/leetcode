package it.adainese.leetcode.powerofthree;

class Solution {

  public boolean isPowerOfThree_loop(int n) {

    if (n < 1) {
      return false;
    }

    while (n % 3 == 0) {
      n /= 3;
    }

    return n == 1;
  }

  public boolean isPowerOfThree(int n) {
    final int maxPowerOfThree = 1162261467;
    return n > 0 && (maxPowerOfThree % n) == 0;
  }
}
