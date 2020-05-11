package com.problems.longestpalindrome;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LongestPalindromeTest {

  @Parameters(name = "Test {index}: shouldReturnLongestPalindrome({0})={1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][] { 
        { "", 0 }, 
        { "ababd", 3 }, 
        { "aaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaa", 51 },
        { "aaaaaaaxaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaxaaaaaaaaaa", 29 } 
      }
    );
  }

  private String input;

  private int expected;

  private LongestPalindrome lp = new LongestPalindrome();

  public LongestPalindromeTest(String input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void test() {
    assertEquals(expected, lp.longestPalindrome(input).length());
  }
}