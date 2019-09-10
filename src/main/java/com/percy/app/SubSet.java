/**
 * 
 */

package com.percy.app;

import java.util.Stack;

/**
 * SubSet
 */
public class SubSet {

  int[] x;
  int t;

  public void backtracking() {
    Stack<Integer> path = new Stack<>();
    helper1(x, x.length, t, path);
  }

  private void helper1(int[] x, int length, int t, Stack<Integer> path) {
    if (length >= 0) {
      if (t == 0) {
        print(path);
      } else if (t > 0 && length > 0) {
        helper1(x, length - 1, t, path);
        path.push(x[length - 1]);
        helper1(x, length - 1, t - x[length - 1], path);
        path.pop();
      }
    }
  }

  public void dynamicProgramming() {
    int[][] s = new int[x.length + 1][t + 1];
    for (int i = 0; i != s.length; i++) {
      s[i][0] = 1;
    }
    for (int i = 1; i != s.length; i++) {
      for (int j = 1; j != s[0].length; j++) {
        int tmp1 = s[i - 1][j];
        int tmp2 = j >= x[i - 1] ? s[i - 1][j - x[i - 1]] : 0;
        s[i][j] = Integer.max(tmp1, tmp2);
      }
    }
    for (int i = 0; i != s.length; i++) {
      for (int j = 0; j != s[0].length; j++) {
        System.out.printf("%d\t", s[i][j]);
      }
      System.out.println();
    }
  }

  private void print(Stack<Integer> path) {
    System.out.println(path);
  }

  public SubSet(int[] x, int t) {
    this.x = x;
    this.t = t;
  }

  public SubSet() {
    this(new int[] { 8, 6, 7, 5, 3, 10, 9 }, 15);
  }
}