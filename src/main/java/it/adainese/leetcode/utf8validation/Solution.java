package it.adainese.leetcode.utf8validation;

class Solution {

//  Number of Bytes   |        UTF-8 Octet Sequence
//                    |              (binary)
//--------------------+-----------------------------------------
//         1          |   0xxxxxxx
//         2          |   110xxxxx 10xxxxxx
//         3          |   1110xxxx 10xxxxxx 10xxxxxx
//         4          |   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx


  private static final int[] masks = new int[]{0x00000080, 0x0000E0C0, 0x00F0C0C0, 0xF8C0C0C0};
  private static final int[] valid = new int[]{0x00000000, 0x0000C080, 0x00E08080, 0xF0808080};

  public boolean validUtf8(int[] data) {

    int size = 0;
    int acc = 0;
    for (int i : data) {
      acc |= i;
      if ((acc & masks[size]) == valid[size]) {
        acc = 0;
        size = 0;
      } else if (++size == 4) {
        return false;
      }
      acc <<= 8;
    }

    return size == 0;
  }
}
