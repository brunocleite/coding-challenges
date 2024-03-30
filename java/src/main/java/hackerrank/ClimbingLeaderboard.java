package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Climbing the Leaderboard
 * Level: Medium
 * <a href="https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true">...</a>
 * Score:
 */
public class ClimbingLeaderboard {

  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    List<Integer> rankList = new ArrayList<>();
    Integer currentRank = 1;
    Integer lastScore = null;
    //Create rank list
    for (Integer rank : ranked) {
      if (lastScore == null) {
        lastScore = rank;
      }
      if (!Objects.equals(lastScore, rank)) {
        lastScore = rank;
        currentRank++;
      }
      rankList.add(currentRank);
    }
    //Create player rank climb list
    List<Integer> playerRankList = new ArrayList<>();
    for (Integer playerRank : player) {

      int previousSize = playerRankList.size();
      for (int i = 0; i < ranked.size(); i++) {
        Integer rank = ranked.get(i);
        if (rank <= playerRank) {
          playerRankList.add(rankList.get(i));
          break;
        }
      }
      if(previousSize == playerRankList.size()){
        playerRankList.add(currentRank+1);
      }
    }
    return playerRankList;

  }

}
