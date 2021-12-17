package com.java;

public class SubtractSum {
    public static int subtractSum(int n) {
        int sum = 0;
        int product=1;
        int currentValue=n;
        int result=0;
      if (n>=10 && n<10000) {
          while (currentValue > 0) {
              int now = currentValue % 10;
              sum += now;
              product *= now;
              currentValue = currentValue / 10;

 result=product-sum;

          }
      }

        return result;
    }
}
