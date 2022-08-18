package it.adainese.leetcode.firstuniquecharacterinastring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {

  Map<Character, Integer> counts = new ConcurrentHashMap<>();

  public int firstUniqChar(String s) {

    var n = s.length();

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < n; i++) {
      if (counts.get(s.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;
  }
}
