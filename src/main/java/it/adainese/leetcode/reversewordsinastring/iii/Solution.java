package it.adainese.leetcode.reversewordsinastring.iii;

class Solution {

  public String reverseWords(String s) {

    byte[] asBytes = s.getBytes();

    int i = 0;
    int j = 0;

    for (; i < asBytes.length; ++i) {
      if (asBytes[i] == (byte) ' ') {
        reverse(asBytes, j, i - 1);
        j = i + 1;
      }
    }

    reverse(asBytes, j, i - 1);

    return new String(asBytes);
  }

  void reverse(byte[] bytes, int first, int last) {
    for (; last > first; --last, ++first) {
      byte tmp = bytes[last];
      bytes[last] = bytes[first];
      bytes[first] = tmp;
    }
  }
}
