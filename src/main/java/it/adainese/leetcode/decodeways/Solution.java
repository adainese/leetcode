package it.adainese.leetcode.decodeways;

class Solution {

  public int numDecodings(String s) {

    int l = s.length();
    int[][] dp = new int[l][2];

    if (s.charAt(0) == '0') {
      return 0;
    }
    dp[0][0] = 1;

    for (int i = 1; i < l; i++) {
      if (s.charAt(i) == '0') {
        dp[i][0] = 0;
      } else {
        dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
      }
      if (s.charAt(i - 1) > '2' || (s.charAt(i - 1) == '2' && s.charAt(i) > '6')) {
        dp[i][1] = 0;
      } else {
        dp[i][1] = dp[i - 1][0];
      }
    }

    return dp[l - 1][0] + dp[l - 1][1];
  }
}
