package codesignal;

import java.util.Arrays;

public class CoverDebts {

  double solution(int s, int[] debts, int[] interests) {
    double[] dDebts = Arrays.stream(debts).asDoubleStream().toArray();
    int paid = 0;
    double paidAmount = 0;

    while (paid < dDebts.length) {
      double cashAvailable = s * 0.1;
      while (cashAvailable > 0 && paid < dDebts.length) {
        int position = findMaxPosition(interests);

        if (dDebts[position] > cashAvailable) {
          paidAmount += cashAvailable;
          dDebts[position] -= cashAvailable;
          cashAvailable = 0;
        } else if (dDebts[position] <= cashAvailable) {
          cashAvailable -= dDebts[position];
          paidAmount += dDebts[position];
          paid++;
          dDebts[position] = 0;
          interests[position] = 0;
        }
      }
      applyInterests(dDebts, interests);
    }

    return paidAmount;
  }

  void applyInterests(double[] debts, int[] interests) {
    for (int i = 0; i < debts.length; i++) {
      if (debts[i] > 0) {
        debts[i] = debts[i] + debts[i] * (interests[i] / 100.0);
      }
    }
  }


  int findMaxPosition(int[] interests) {
    int maxValue = 0;
    int maxPosition = 0;
    for (int i = 0; i < interests.length; i++) {
      if (interests[i] > maxValue) {
        maxValue = interests[i];
        maxPosition = i;
      }
    }

    return maxPosition;
  }


}
