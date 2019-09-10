/**
 * 
 */

package com.percy.app;

import java.util.Stack;

/**
 * ZeroOrOne
 */
public class KnapsackZeroOrOne {

  int c;
  int[] w;

  /**
   * 
   * @return
   */
  public int[] backtracking() {
    int[] x = new int[w.length];
    Stack<Integer> path = new Stack<>();
    helper1(path, x);
    return x;
  }

  private void helper1(Stack<Integer> path, int[] x) {
    if (path.size() == w.length) {
      int sum = 0;
      int max = 0;
      for (int i = 0; i != x.length; i++) {
        sum += path.get(i) * w[i];
        max += x[i] * w[i];
      }
      if (sum > max && sum <= c) {
        for (int i = 0; i != x.length; i++) {
          x[i] = path.get(i);
        }
      }
    } else {
      int sum = 0;
      for (int i = 0; i != path.size(); i++) {
        sum += path.get(i) * w[i];
      }
      if (sum <= c) {
        path.push(0);
        helper1(path, x);
        path.pop();
        path.push(1);
        helper1(path, x);
        path.pop();
      }
    }
  }

  /**
   * 
   */
  public void dynamicProgramming() {
    int[][] s = new int[w.length + 1][c + 1];
    for (int i = 0; i != s.length; i++) {
      s[i][0] = 0;
    }
    for (int j = 0; j != s[0].length; j++) {
      s[0][j] = 0;
    }
    for (int i = 1; i != s.length; i++) {
      for (int j = 1; j != s[0].length; j++) {
        int tmp1 = s[i - 1][j];
        int tmp2 = j >= w[i - 1] ? s[i - 1][j - w[i - 1]] + w[i - 1] : 0;
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

  public KnapsackZeroOrOne(int c, int[] w) {
    this.c = c;
    this.w = w;
  }

  public KnapsackZeroOrOne() {
    this(20, new int[] { 1, 2, 3, 4, 7, 5, 2, 4, 6 });
  }
}