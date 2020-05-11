package com.problems.validparentheses;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValidParenthesesTest {

  @Parameters(name = "Test {index}: shouldValidateParenthesis({0})={1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][] { 
        { "()", true }, 
        { "({[{({()([]{([][][()])})})}]})", true }, 
        { "(()))", false },
        { "((((({{{{{{}{}}}{}{}{}{}}}}{}{}{}}{{{}}}{}}}}}}}]]][][][]][][]]]]][][][][]][]]", false } 
      }
    );
  }

  private String input;

  private boolean expected;

  private ValidParentheses lp = new ValidParentheses();

  public ValidParenthesesTest(String input, boolean expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void test() {
    assertEquals(expected, lp.validParentheses(input));
  }
}