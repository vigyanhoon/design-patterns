package com.practise;

import java.util.Arrays;

public class Array {
  private int[] _arr;
  private int _count;

  Array(int size) {
    _arr = new int[size];
  }

  void add(int num) {
    if (_count == _arr.length) {
      int [] arr = new int[_count*2];
      for (int i = 0; i < _arr.length; i++) {
        arr[i] = _arr[i];
      }
      _arr = arr;
    }
    _arr[_count] = num;
    _count++;
  }

  public void print() {
    for (int i = 0; i < _count; i++) {
      System.out.print(_arr[i] + " ");
    }
    System.out.println(Arrays.toString(_arr));
  }

  public void remove(int index) {
    for (int i = index; i < _count; i++) {
      _arr[i] = _arr[i+1];
    }
    _count--;
  }
}
