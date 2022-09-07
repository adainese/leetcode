package it.adainese.leetcode.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TreeCodecTest {

  @Test
  void serialize_1() {
    var root = new TreeNode(0,
        new TreeNode(-3,
            new TreeNode(-10),
            null),
        new TreeNode(9,
            new TreeNode(5),
            null));

    var actual = new TreeCodec().serialize(root);
    System.out.println(actual);
    assertThat(actual).isEqualTo("[0,-3,9,-10,null,5]");
  }

  @Test
  void deserialize() {
  }
}
