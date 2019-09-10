/**
 * 
 */

package com.percy.app;

/**
 * Sort
 */
public class Sort {

  int[] x;
  int count = 0;

  public int[] mergeSort() {
    int[] y = x.clone();
    int[] tmp = new int[y.length];
    helper1(y, 0, y.length, tmp);
    return y;
  }

  private void helper1(int[] y, int low, int high, int[] tmp) {
    if (high - low > 1) {
      int mid = (low + high) / 2;
      helper1(y, low, mid, tmp);
      helper1(y, mid, high, tmp);
      merge(y, low, high, tmp);
    }
  }

  private void merge(int[] y, int low, int high, int[] tmp) {
    int mid = (low + high) / 2;
    int i = low;
    int j = mid;
    int z = low;
    while(i != mid && j != high) {
      while (i != mid && j != high && y[i] <= y[j]) {
        count += (z - i);
        tmp[z++] = y[i++];
      }
      while(i != mid && j != high && y[j] < y[i]) {
        tmp[z++] = y[j++];
      }
    }
    if (i == mid) {
      while (j != high) {
        tmp[z++] = y[j++];
      }
    } else if (j == high) {
      while (i != mid) {
        tmp[z++] = y[i++];
        count += (z - i);
      }
    }
    for (int ind = low; ind != high; ind++) {
      y[ind] = tmp[ind];
    }
  }

  public Sort() {
    this(new int[] { 3, 2, 1, 4, 5 });
  }

  public Sort(int[] x) {
    this.x = x;
  }
}