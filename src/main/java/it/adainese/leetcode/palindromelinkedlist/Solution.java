package it.adainese.leetcode.palindromelinkedlist;

import it.adainese.leetcode.common.ListNode;
import java.util.ArrayList;

class Solution {

  public boolean isPalindrome_naive(ListNode head) {
    var asArray = new ArrayList<Integer>();

    while (head != null) {
      asArray.add(head.val);
      head = head.next;
    }

    for (int f = 0, l = asArray.size() - 1; f <= l; f++, l--) {
      if (!asArray.get(f).equals(asArray.get(l))) {
        return false;
      }
    }
    return true;
  }

  public boolean isPalindrome(ListNode head) {

    var copy = head;

    int length = 0;
    while (copy != null) {
      copy = copy.next;
      length++;
    }
    int mid = length >> 1;

    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;
    while (mid != 0) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
      mid--;
    }
    if ((length & 1) != 0) {
      current = current.next;
    }

    while (current != null) {
      if (current.val != previous.val) {
        return false;
      }
      current = current.next;
      previous = previous.next;
    }

    return true;
  }
}
