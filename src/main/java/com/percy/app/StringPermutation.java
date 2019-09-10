/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * StringPermutation
 */
public class StringPermutation {

  public ArrayList<String> permutation(String str) {
    ArrayList<String> list = new ArrayList<>();
    StringBuffer sb = new StringBuffer(str);
    helper1(sb, 0, list);
    return list;
  }

  private void helper1(StringBuffer sb, int i, ArrayList<String> list) {
    if (i == sb.length()) {
      list.add(sb.toString());
    } else {
      helper1(sb, i + 1, list);
      Set<Character> set = new HashSet<>();
      for (int j = i + 1; j != sb.length(); j++) {
        if (sb.charAt(i) != sb.charAt(j) && !set.contains(sb.charAt(j))) {
          set.add(sb.charAt(j));
          swap(sb, i, j);
          helper1(sb, i + 1, list);
          swap(sb, i, j);
        }
      }
    }
  }

  public void swap(StringBuffer sb, int i, int j) {
    char tmp = sb.charAt(i);
    sb.setCharAt(i, sb.charAt(j));
    sb.setCharAt(j, tmp);
  }
}