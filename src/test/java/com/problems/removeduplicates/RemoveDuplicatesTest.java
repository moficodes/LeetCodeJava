package com.problems.removeduplicates;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RemoveDuplicatesTest {

  @Parameters(name = "Test {index}: shouldReturnLenghtOfDedupedArr({0})={1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][] { 
        { new int[]{1,1,1,1,2,3,4}, 4 }, 
        { new int[]{1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,4,4,4}, 4 }, 
        { new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1}, 1 },
        { new int[]{1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3}, 3 } 
      }
    );
  }

  private int[] input;

  private int expected;

  private RemoveDuplicates rd = new RemoveDuplicates();

  public RemoveDuplicatesTest(int[] input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void test() {
    assertEquals(expected, rd.removeduplicates(input));
  }
}