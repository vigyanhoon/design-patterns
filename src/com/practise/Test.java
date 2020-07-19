package com.practise;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
//        Array arr = new Array(3);
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.add(50);
//        arr.print();
//        arr.remove(2);
//        arr.print();
//        arr.remove(0);
//        arr.print();

//        for(int i = 0; i<nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(0);
        System.out.println(list.indexOf(0));
    }
}
