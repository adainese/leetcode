package it.adainese.leetcode.narytreelevelordertraversal;

import it.adainese.leetcode.common.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {

  public List<List<Integer>> levelOrder(Node root) {
    if (null == root) {
      return List.of();
    }
    TreeMap<Integer, List<Integer>> map = new TreeMap<>();
    collectMap(map, root, 1);
    return map.navigableKeySet().stream().map(map::get).toList();
  }

  private void collectMap(Map<Integer, List<Integer>> map, Node current, Integer level) {
    var nodes = map.computeIfAbsent(level, ignored -> new ArrayList<>());
    nodes.add(current.val);
    if (current.children != null) {
      for (Node child : current.children) {
        collectMap(map, child, level + 1);
      }
    }
  }

}
