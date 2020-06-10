package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testDenormalized(String str) {

    str = str.replaceAll("[\\W_]+", "").toLowerCase();

    return testRecursive(str);
  }

  public static boolean testRecursive(String input) {
    boolean isPalindrome = false;
    if (input.length() <= 1

    || (
        input.charAt(0) == input.charAt(input.length() - 1)
        && testRecursive(input.substring(1, input.length() - 1))
        )
    ) {
      isPalindrome = true;
    }
    return isPalindrome;
  }

  public static boolean testIterative(String input) {
    boolean isPalindrome = false;
    if (input.length() <= 1) {
      isPalindrome = true;
    }

    for (int i = 0; i < input.length() / 2; i++) {
      for (int j = input.length() - 1; j > (input.length() - 1) / 2; j--) {
        if (input.charAt(i) == input.charAt(j)) {
          isPalindrome = true;
        }
      }
    }

    return isPalindrome;
  }

}
