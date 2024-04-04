package codesignal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoverDebtsTest {

  @Test
  void testCase1() {
    assertEquals(22, new CoverDebts().solution(50, new int[]{2,2,5}, new int[]{200,100,150}));
  }

  @Test
  void testCase2() {
    assertEquals(10.8125, new CoverDebts().solution(40, new int[]{2,2,5}, new int[]{75,25,25}));
  }

}