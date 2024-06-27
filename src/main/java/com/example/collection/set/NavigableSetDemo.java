package com.example.collection.set;

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(1000);
        ts.add(2000);
        ts.add(3000);
        ts.add(4000);
        ts.add(5000);
        System.out.println(ts.ceiling(1000));
        System.out.println(ts.higher(4000));
        System.out.println(ts.floor(5000));
        System.out.println(ts.lower(3000));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.descendingSet());
        System.out.println(ts);
    }
}
