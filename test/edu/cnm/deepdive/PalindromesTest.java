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

  static final String[] normParams = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  static final boolean[] normExpected = {
      true,
      true,
      true,
      false,
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

  @Test
  void testDenormalized() {
    Palindromes recursive = new Palindromes();
    for (int i = 0; i < normParams.length; i++) {
      boolean actual = recursive.testDenormalized(normParams[i]);
      assertEquals(normExpected[i], actual);
    }

  }
}