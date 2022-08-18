package it.adainese.leetcode.reducearraysizetothehalf;


import java.util.Comparator;
import java.util.HashMap;

class Solution {


  public int minSetSize(int[] arr) {

    var frequencies = new HashMap<Integer, Integer>();

    for (int i : arr) {
      frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
    }

    int halfSize = arr.length >> 1;

    var iter = frequencies.values().stream().sorted(Comparator.reverseOrder()).iterator();

    int sum = 0;
    int sets = 0;

    while (iter.hasNext() && sum < halfSize) {
      sum += iter.next();
      sets++;
    }

    return sets;
  }
}
