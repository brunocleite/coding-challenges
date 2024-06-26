package leetcode;

// https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

/**
 * Zigzag Conversion -- Level: Medium -- Score: Beats 99.45% of users with Java
 */
class ZigZagConversion {

  public String convert(String s, int numRows) {

    StringBuilder outputString = new StringBuilder();
    int sizeLimit = s.length();
    if (numRows == 1) {
      return s;
    }
    char[] charArray = s.toCharArray();
    List<Character> charList = new ArrayList<>();
    for (char c : charArray) {
      charList.add(c);
    }
    for (int i = 0; i < numRows; i++) {

      //First and last rows
      if (i == 0 || i == numRows - 1) {
        for (int j = i; j < sizeLimit; j += (numRows + numRows - 2)) {
          outputString.append(charList.get(j));
        }
        continue;
      }

      //Middle rows
      int middleRowPositionBackwards = numRows - i - 1;
      int skip1 = middleRowPositionBackwards * 2;
      int skip2 = i * 2;
      boolean isSkip1 = false;
      for (int j = i; j < sizeLimit; j += isSkip1 ? skip1 : skip2) {
        outputString.append(charList.get(j));
        isSkip1 = !isSkip1;
      }
    }

    return outputString.toString();

  }
}
