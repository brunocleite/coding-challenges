package naukri;

import java.util.List;

/**
 * Rose Garden
 * Level: Moderate
 * <a href="https://www.naukri.com/code360/problems/rose-garden_2248080">...</a>
 * Score: 72/80
 */
public class RoseGarden {

  public static int roseGarden(int[] arr, int k, int m) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    list.stream().filter(i -> i % 2 == 0).count();

    int n = arr.length;
    if (m * k > n) {
      return -1;
    }
    int bouquetsFormed = 0;
    int adjacentRoses = 0;
    for (int currentDay = 1; currentDay < 1000000000; currentDay++) {
      for (int j : arr) {
        //Iterate through a day
        if (currentDay >= j) {
          adjacentRoses++;
          if (adjacentRoses >= k) {
            bouquetsFormed++;
            adjacentRoses = 0;
          }
        } else {
          adjacentRoses = 0;
        }
        if (bouquetsFormed >= m) {
          return currentDay;
        }
      }
      bouquetsFormed = 0;
      adjacentRoses = 0;
    }
    return -1;
  }

}