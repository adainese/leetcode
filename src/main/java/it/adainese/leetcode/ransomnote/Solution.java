package it.adainese.leetcode.ransomnote;

class Solution {

  public boolean canConstruct(String ransomNote, String magazine) {

    int[] counts = new int['z' - 'a' + 1];

    for (byte b : magazine.getBytes()) {
      counts[b - 'a'] = counts[b - 'a'] + 1;
    }

    for (byte b : ransomNote.getBytes()) {
      if (counts[b - 'a'] <= 0) {
        return false;
      }
      counts[b - 'a'] = counts[b - 'a'] - 1;
    }

    return true;
  }
}
