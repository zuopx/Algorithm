/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * SubSetTest
 */
public class SubSetTest {

  @Test
  public void testBacktracking() {
    SubSet ss = new SubSet();
    ss.backtracking();
  }

  @Test
  public void testDynamicProgramming() {
    SubSet ss = new SubSet();
    ss.dynamicProgramming();
  }
}