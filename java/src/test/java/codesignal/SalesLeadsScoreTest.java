package codesignal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalesLeadsScoreTest {

  @Test
  void testCase1() {
    assertArrayEquals(new String[]{"lead4", "lead5", "lead2"},
        new SalesLeadsScore().solution(new String[]{"lead1", "lead2", "lead3", "lead4", "lead5"},
            new int[]{250, 300, 250, 260, 310},
            new int[]{1000, 800, 1100, 1200, 1000},
            new boolean[]{true, false, true, false, false}));
  }

}