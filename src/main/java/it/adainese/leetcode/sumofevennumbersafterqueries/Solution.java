package it.adainese.leetcode.sumofevennumbersafterqueries;

class Solution {

  public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

    int sum = 0;
    for (int num : nums) {
      if (isEven(num)) {
        sum += num;
      }
    }

    var totals = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      int val = queries[i][0];
      int index = queries[i][1];
      if (isEven(nums[index])) {
        sum -= nums[index];
      }
      nums[index] += val;
      if (isEven(nums[index])) {
        sum += nums[index];
      }
      totals[i] = sum;
    }

    return totals;
  }

  boolean isEven(int num) {
    return (num & 1) == 0;
  }
}
