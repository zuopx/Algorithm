/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * StringPremutationTest
 */
public class StringPremutationTest {

  @Test
  public void testSwap() {
    StringBuffer sb = new StringBuffer("012345678");
    new StringPermutation().swap(sb, 0, 7);
    System.out.println(sb.toString());
  }

  @Test
  public void testPermutation() {
    ArrayList<String> list = new StringPermutation().permutation("abc");
    Collections.sort(list);
    System.out.println(list.size());
    System.out.println(list);
  }
}