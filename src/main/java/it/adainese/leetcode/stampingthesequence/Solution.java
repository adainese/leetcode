package it.adainese.leetcode.stampingthesequence;

import java.util.Arrays;

class Solution {

  public int[] movesToStamp(String stamp, String target) {

    int firstMove = 9;
    int[] moves = new int[10];

    char[] s = stamp.toCharArray();
    char[] t = target.toCharArray();
    int size = t.length;
    int offset = 0;

    while (size > 0 && offset < s.length) {
      for (int i = 0; i < t.length; i++) {
        if (t[i] == s[0]) {
          if (0 == Arrays
              .compare(t, i, i + s.length - offset, s, 0, s.length - offset)) {

          }
        } else if (t[i] == s[offset]) {

        }

      }
      offset++;
    }

    return Arrays.copyOfRange(moves, firstMove, 9);
  }
}
