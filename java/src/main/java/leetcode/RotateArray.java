package leetcode;

//https://leetcode.com/problems/rotate-array
/**
 * Rotate Array
 * Level: Medium
 */
public class RotateArray {

  public void rotate(int[] nums, int k) {
    if(nums.length <= 1){
      return;
    }
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int resultPos = i + k;
      if (resultPos >= nums.length) {
        resultPos -= nums.length * (resultPos/nums.length);
      }
      result[resultPos] = nums[i];
    }
    System.arraycopy(result, 0, nums, 0, nums.length);
  }

}
