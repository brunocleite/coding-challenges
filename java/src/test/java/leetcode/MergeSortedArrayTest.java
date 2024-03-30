package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {


  @Test
  void test1(){
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    new MergeSortedArray().merge(nums1, 3, new int[]{2,5,6}, 3);

    assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
  }

  @Test
  void test2(){
    int[] nums1 = {1};
    new MergeSortedArray().merge(nums1, 1, new int[]{}, 0);
    assertArrayEquals(new int[]{1}, nums1);
  }

  @Test
  void test3(){
    int[] nums1 = {0};
    new MergeSortedArray().merge(nums1, 0, new int[]{1}, 1);
    assertArrayEquals(new int[]{1}, nums1);
  }

}