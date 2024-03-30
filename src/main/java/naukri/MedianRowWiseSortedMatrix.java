package naukri;

import java.util.Arrays;

/**
 * Median in a row-wise sorted Matrix
 * Level: Moderate
 * <a href="https://www.naukri.com/code360/problems/median-of-a-row-wise-sorted-matrix_1115473">Link</a>
 * Score: 76.8/80
 */
public class MedianRowWiseSortedMatrix {

  public static int findMedian(int[][] matrix, int r, int c) {
    int listSize = r * c;
    int[] list = new int[listSize];
    for (int i = 0; i < listSize; i++) {
      list[i] = matrix[i / c][i % c];
    }
    Arrays.sort(list);
    return list[listSize / 2];
  }
}
