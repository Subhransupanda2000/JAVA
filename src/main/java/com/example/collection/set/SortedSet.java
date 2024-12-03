package com.example.collection.set;

import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(1000);
        ts.add(2000);
        ts.add(3000);
        ts.add(4000);
        ts.add(5000);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(3000));
        System.out.println(ts.subSet(2000,4000));
        System.out.println(ts.subSet(2000,4000));
    }
}
