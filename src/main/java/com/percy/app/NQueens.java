/**
 * 
 */

package com.percy.app;

/**
 * NQueens
 */
public class NQueens {

  int n;
  int count = 0;

  /**
   * 1. 解的表示
   * 2. 解的组织
   * 3. 递归的条件
   */
  public void backtracking() {
    int[] queens = new int[n];
    helper1(queens, 0);
  }

  /**
   * pre: The first r queens are place well.
   * 
   * @param queens
   * @param r
   */
  private void helper1(int[] queens, int r) {
    if (r == n) {
      count++;
      print(queens);
    } else {
      for (int i = 0; i != n; i++) {
        boolean legal = true;
        for (int j = 0; j != r; j++) {
          if (queens[j] == i || queens[j] == i + (r - j) 
              || queens[j] == i - (r - j)) {
            legal = false;
            break;
          }
        }
        if (legal) {
          queens[r] = i;
          helper1(queens, r + 1);
        }
      }
    }
  }

  private void print(int[] queens) {
    for (int i = 0; i != n; i++) {
      println(queens[i]);
    }
    System.out.println("*****************************************************");
  }

  private void println(int i) {
    StringBuffer sb = new StringBuffer();
    for (int j = 0; j != n; j++) {
      if (j == i) {
        sb.append(" & ");
      } else {
        sb.append(" - ");
      }
    }
    System.out.println(sb.toString());
  }

  public NQueens(int n) {
    this.n = n;
  }

  public NQueens() {
    this(4);
  }
}