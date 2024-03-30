package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZigZagConversionTest {

  @Test
  void example1(){
    assertEquals("PAHNAPLSIIGYIR", new ZigZagConversion().convert("PAYPALISHIRING", 3));
  }

  @Test
  void example2(){
    assertEquals("PINALSIGYAHRPI", new ZigZagConversion().convert("PAYPALISHIRING", 4));
  }

  @Test
  void case3(){
    assertEquals("A", new ZigZagConversion().convert("A", 1));
  }

}