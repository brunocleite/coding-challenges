package codesignal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PacketDescrambler {

  String solution(int[] seq, char[] fragmentData, int n) {

    Map<Integer, Map<Character, Integer>> theMap = new TreeMap<>();

    for (int i = 0; i < seq.length; i++) {
      theMap.putIfAbsent(seq[i], new HashMap<>());
      theMap.get(seq[i]).compute(fragmentData[i], (k, v) -> {
        if (v == null) {
          return 1;
        } else {
          return v + 1;
        }
      });
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < theMap.size(); i++) {
      if (theMap.get(i) == null) {
        return "";
      }
      Character c = theMap.get(i).entrySet()
          .stream().min((e1, e2) -> {
            int v1 = e1.getValue();
            int v2 = e2.getValue();
            return Integer.compare(v2, v1);
          })
          .filter(e -> (double) e.getValue() > (double) n / 2)
          .map(Map.Entry::getKey)
          .orElse(null);
      if (c == null ||
          (i == theMap.size() - 1 && c != '#') ||
          (i < theMap.size() - 1 && c == '#')) {
        return "";
      }
      sb.append(c);
    }

    return sb.toString();

  }

}
