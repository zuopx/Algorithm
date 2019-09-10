/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * SortTest
 */
public class SortTest {

  @Test
  public void testMergeSort() {
    int[] x = new int[] { 1, 2, 3, 4, 5, 6, 7, 0 };
    Sort st = new Sort(x);
    int[] y = st.mergeSort();
    System.out.println(st.count);
    for (int var : y) {
      System.out.printf("%d\t", var);
    }
    System.out.println();
  }
}