package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] testParams = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final Boolean[] testExpected = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  @Test
  void testRecursive() {
    Palindromes recursive = new Palindromes();
    for (int i = 0; i < testParams.length; i++) {
    boolean actual = recursive.testRecursive(testParams[i]);
    assertEquals(testExpected[i], actual);
    }
  }
}