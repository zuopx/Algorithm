/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * KnapsackTest
 */
public class KnapsackTest {

  @Before
  public void setUp() {

  }

  @Test
  public void testKnapsackZeroOrOneBacktracking() {
    KnapsackZeroOrOne kzo = new KnapsackZeroOrOne();
    int[] x = kzo.backtracking();
    System.out.println(x);
  }

  @Test
  public void testKnapsackZeroOrOneDynamicProgramming() {
    KnapsackZeroOrOne kzo = new KnapsackZeroOrOne();
    kzo.dynamicProgramming();
  }
}