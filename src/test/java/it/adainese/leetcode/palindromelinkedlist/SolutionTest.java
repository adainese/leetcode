package it.adainese.leetcode.palindromelinkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import it.adainese.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPalindrome_1() {
    var dut = new Solution();
    var palindrome = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
    assertThat(dut.isPalindrome(palindrome)).isTrue();
  }

  @Test
  void isPalindrome_2() {
    var dut = new Solution();
    var notPalindrome = new ListNode(1, new ListNode(2));
    assertThat(dut.isPalindrome(notPalindrome)).isFalse();
  }

  @Test
  void isPalindrome_3() {
    var dut = new Solution();
    var palindrome = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
    assertThat(dut.isPalindrome(palindrome)).isTrue();
  }
}
