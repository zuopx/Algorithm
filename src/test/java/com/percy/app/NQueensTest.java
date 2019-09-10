/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * NQueensTest
 */
public class NQueensTest {

  @Test
  public void testBacktracking() {
    NQueens nq = new NQueens(6);
    nq.backtracking();
    System.out.println(nq.count);
  }
}