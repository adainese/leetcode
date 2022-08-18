package it.adainese.leetcode.kthsymbolingrammar;

class Solution {
  public int kthGrammar(int n, int k) {
    if (1 == k) {
      return 0;
    }
    if (2 == k) {
      return 1;
    }

    int invert = 1;
    if ((k & 1) == 1) {
      invert = 0;
      k++;
    }

    return  invert ^ kthGrammar(n-1, k/2);
  }

}
