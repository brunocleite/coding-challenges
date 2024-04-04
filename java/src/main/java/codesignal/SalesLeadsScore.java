package codesignal;

import java.util.ArrayList;
import java.util.List;

public class SalesLeadsScore {


  String[] solution(String[] names, int[] time, int[] netValue, boolean[] isOnVacation) {
    List<Lead> leads = new ArrayList<>();
    for (int i = 0; i < names.length; i++) {
      if (!isOnVacation[i]) {
        leads.add(new Lead(names[i], time[i], netValue[i]));
      }
    }

    return leads.stream().sorted((Lead l1, Lead l2) -> {
      if (l1.getScore() > l2.getScore()) {
        return -1;
      } else if (l1.getScore() < l2.getScore()) {
        return 1;
      } else {
        if (l1.getTime()> l2.getTime()) {
          return -1;
        } else if (l1.getTime() < l2.getTime()) {
          return 1;
        } else {
          return l1.getName().compareTo(l2.getName());
        }
      }
    }).map(Lead::getName).toList().toArray(new String[0]);
  }

  class Lead {

    private String name;
    private int time;
    private double score;

    public Lead(String name, int time, int netValue) {
      this.name = name;
      this.time = time;
      this.score = netValue * time / 365.0;
    }

    public String getName() {
      return name;
    }

    public double getScore() {
      return score;
    }

    public int getTime() {
      return time;
    }

  }


}
