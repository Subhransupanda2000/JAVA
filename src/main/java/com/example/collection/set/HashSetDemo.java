package com.example.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(104);
        hashSet.add(105);
        hashSet.add(106);
        hashSet.add(107);
        hashSet.add(101);
        hashSet.add(102);
        hashSet.add(109);
        hashSet.add(103);
        hashSet.add(103);
        hashSet.remove(103);
        hashSet.contains(103);
        hashSet.size();
        hashSet.isEmpty();

        System.out.println(hashSet);
    }
}
