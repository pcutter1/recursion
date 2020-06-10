package edu.cnm.deepdive;

public class Palindromes {



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

}
