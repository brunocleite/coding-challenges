package naukri;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoseGardenTest {

  @Test
  void testCase1(){
    int[] arr = {1, 2, 1, 2, 7, 2, 2, 3, 1};
    int k = 3;
    int m = 2;
    assertEquals(3, RoseGarden.roseGarden(arr, k, m));
  }

  @Test
  void testCase2(){
    int[] arr = {1, 1,1,1};
    int k = 1;
    int m = 2;
    assertEquals(1, RoseGarden.roseGarden(arr, k, m));
  }

  @Test
  void testCase5(){
    int[] arr = {15,6,4};
    int k = 1;
    int m = 4;
    assertEquals(-1, RoseGarden.roseGarden(arr, k, m));
  }



}