package it.adainese.leetcode.uniquemorsecodewords;

import java.util.HashSet;

class Solution {

  private static String[] CODES = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
      "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
      ".--", "-..-", "-.--", "--.."};

  private HashSet<String> unique = new HashSet<>();


  public int uniqueMorseRepresentations(String[] words) {

    unique.clear();
    int size = 0;

    for (String word : words) {
      StringBuilder code = new StringBuilder();
      for (byte letter : word.getBytes()) {
        code.append(CODES[letter - 'a']);
      }
      if (unique.add(code.toString())) {
        size++;
      }
    }

    return size;
  }
}
