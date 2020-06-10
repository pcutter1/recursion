package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   * @param n
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    BigInteger result;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = BigInteger.valueOf(1);
    } else {
      result = BigInteger.valueOf(n).multiply(computeRecursive(n - 1));
    }
    return result;
  }

  public static BigInteger computeIterative(int n) throws IllegalArgumentException {
    BigInteger result = BigInteger.valueOf(1);
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = BigInteger.valueOf(1);
    }
      for (int i = 1; i <= n; i++) {
        result = BigInteger.valueOf(i).multiply(result);
      }
    return result;
  }
}
