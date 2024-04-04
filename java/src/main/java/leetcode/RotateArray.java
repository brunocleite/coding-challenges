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

  public void rotateBestSolution(int[] nums, int k) {
    k = k%nums.length;
    // reverse complete arrya
    reverseArray(nums, 0, nums.length-1);
    // reverse left part of array excluding kth element
    reverseArray(nums, 0, k-1);
    // reverse right part of array starting with kth element
    reverseArray(nums, k, nums.length-1);

  }

  public void reverseArray(int[] a, int l, int r){
    while(l <= r){
      int t = a[l];
      a[l] = a[r];
      a[r] = t;
      l++; r--;
    }
  }

}

