package hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ClimbingLeaderboardTest {

  @Test
  void input1() {
    assertEquals(List.of(6, 4, 2, 1),
        ClimbingLeaderboard.climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10),
            List.of(5, 25, 50, 120)));
  }

  @Test
  void input2() {
    assertEquals(List.of(6, 5, 4, 2, 1),
        ClimbingLeaderboard.climbingLeaderboard(List.of(100, 90, 90, 80, 75, 60
        ), List.of(50, 65, 77, 90, 102
        )));
  }

}