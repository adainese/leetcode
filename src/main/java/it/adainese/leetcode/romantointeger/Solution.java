package it.adainese.leetcode.romantointeger;

class Solution {

  public int romanToInt(String s) {

    var bytes = s.getBytes();

    int num = 0;

    for (int i = 0; i < bytes.length; i++) {
      switch (bytes[i]) {
        case 'I':
          if (i + 1 < bytes.length) {
            switch (bytes[i + 1]) {
              case 'V':
                num += 4;
                i++;
                break;
              case 'X':
                num += 9;
                i++;
                break;
              default:
                num++;
            }
          } else {
            num++;
          }
          break;
        case 'X':
          if (i + 1 < bytes.length) {
            switch (bytes[i + 1]) {
              case 'L':
                num += 40;
                i++;
                break;
              case 'C':
                num += 90;
                i++;
                break;
              default:
                num += 10;
            }
          } else {
            num += 10;
          }
          break;
        case 'C':
          if (i + 1 < bytes.length) {
            switch (bytes[i + 1]) {
              case 'D':
                num += 400;
                i++;
                break;
              case 'M':
                num += 900;
                i++;
                break;
              default:
                num += 100;
            }
          } else {
            num += 100;
          }
          break;
        case 'M':
          num += 1000;
          break;
        case 'V':
          num += 5;
          break;
        case 'L':
          num += 50;
          break;
        case 'D':
          num += 500;
          break;
      }
    }

    return num;
  }
}
