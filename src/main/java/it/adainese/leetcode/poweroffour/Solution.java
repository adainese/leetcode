package it.adainese.leetcode.poweroffour;

class Solution {

  public boolean isPowerOfFour(int n) {
    while (n > 0) {
      if (n == 1) {
        return true;
      }
      if ((n & 3) != 0) {
        return false;
      }
      n >>= 2;
    }

    return false;
  }

  public boolean isPowerOfFourNoLoop(int n) {
    return n > 0 && (n & -n) == n && (n & 0x55555555) == n;
  }
}
