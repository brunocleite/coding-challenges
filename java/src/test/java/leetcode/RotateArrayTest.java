package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RotateArrayTest {

  @Test
  void testCase1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    new RotateArray().rotate(nums, 3);
    assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
  }

  @Test
  void testCase2() {
    int[] nums = {-1, -100, 3, 99};
    new RotateArray().rotate(nums, 2);
    assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
  }

  @Test
  void testCase3() {
    int[] nums = {-1};
    new RotateArray().rotate(nums, 3);
    assertArrayEquals(new int[]{-1}, nums);
  }
  @Test
  void testCase4() {
    int[] nums = {1,2};
    new RotateArray().rotate(nums, 3);
    assertArrayEquals(new int[]{2,1}, nums);
  }
}