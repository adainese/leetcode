package it.adainese.leetcode.splitarrayintoconsecutivesubsequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

  private static class SubSequence {

    int last;
    int size;


    SubSequence(int last) {
      this.last = last;
      this.size = 1;
    }

    boolean push(int next) {
      last = next;
      return ++size == 3;
    }
  }


  public boolean isPossible(int[] nums) {
    if (nums.length < 3) {
      return false;
    }

    int incomplete = 0;
    var buckets = new HashMap<Integer, List<SubSequence>>();

    for (int num : nums) {
      var waitingForNum = buckets.get(num - 1);

      SubSequence current = null;
      if (waitingForNum == null || waitingForNum.isEmpty()) {
        current = new SubSequence(num);
        incomplete++;
      } else {
        int index = 0;
        int min = waitingForNum.get(0).size;
        for (int i = 1; i < waitingForNum.size(); i++) {
          var subs = waitingForNum.get(i);
          if (subs.size < min) {
            min = subs.size;
            index = i;
          }
        }

        current = waitingForNum.remove(index);
        if (current.push(num)) {
          incomplete--;
        }
      }
      var list = buckets.getOrDefault(num, new ArrayList<>());
      list.add(current);
      buckets.put(num, list);
    }

    return incomplete == 0;
  }
}
