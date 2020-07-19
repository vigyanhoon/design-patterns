package com.practise;

public class LinkedList {
  private Node first;
  private Node last;

  LinkedList() {

  }

//  addFirst
//  addLast
//  deleteFirst
//  deleteLast
//  contains
//  indexOf
  public void addLast(int num) {
    Node node = new Node(num);

    if (first == null) {
      first = last = node;
    }
    else {
      last.next = node;
      last = node;
    }
  }

  public void addFirst(int num) {
    Node node = new Node(num);

    if(first == null) {
      first = last = node;
    }
    else {
      node.next = first;
      first = node;
    }
  }

  public int indexOf(int num) {
    Node currentNode = first;
    int currentIndex = 0;
    while(currentNode != null) {
      if (currentNode.value == num) {
        return currentIndex;
      }
      currentIndex++;
      currentNode = currentNode.next;
    }
    return -1;
  }
}
