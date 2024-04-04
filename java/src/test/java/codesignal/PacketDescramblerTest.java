package codesignal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PacketDescramblerTest {

  @Test
  void testCase1() {
    assertEquals("A+#",
        new PacketDescrambler().solution(new int[]{1, 1, 0, 0, 0, 2, 2, 2}, new char[]{'+',
            '+',
            'A',
            'A',
            'B',
            '#',
            '#',
            '#'}, 3));
  }

  @Test
  void testCase2() {
    assertEquals("",
        new PacketDescrambler().solution(new int[]{1, 1, 0, 0, 0, 2, 2, 2}, new char[]{
            '+',
            '+',
            'A',
            'A',
            'B',
            '#',
            '#',
            '#'}, 4));
  }

}