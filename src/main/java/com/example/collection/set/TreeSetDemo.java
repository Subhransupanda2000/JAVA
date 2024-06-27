package com.example.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add("xx");
        ts.add("yy");
        ts.add("zz");
        ts.add(new StringBuffer("ABC"));
        ts.add(new StringBuffer("AA"));
        ts.add("bb");
        ts.add("aa");
        ts.add("cc");
        ts.add("ww");
        System.out.println(ts);
    }
}
class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }
}
