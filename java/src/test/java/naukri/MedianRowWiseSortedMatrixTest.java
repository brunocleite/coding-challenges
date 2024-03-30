package naukri;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianRowWiseSortedMatrixTest {

  @Test
  void sampleCase(){
    int[][] matrix = {
      {1, 5, 7, 9, 11},
      {2, 3, 4, 8, 9 },
      {4, 11, 14, 19, 20 },
      {6, 10, 22, 99, 100 },
      {7, 15, 17, 24, 28 }
    };
    assertEquals(10, MedianRowWiseSortedMatrix.findMedian(matrix, 5, 5));
  }

  @Test
  void testCase2(){
    int[][] matrix = {
        {1, 2, 3, 4, 5},
        {8, 9, 11, 12, 13 },
        {21, 23, 25, 27, 29 }
    };
    assertEquals(11, MedianRowWiseSortedMatrix.findMedian(matrix, 3, 5));
  }

}