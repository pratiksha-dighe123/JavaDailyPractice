package com.collection;
import java.util.HashSet;

public class HashSetDemo {
        public static void main(String[] args) {

            HashSet<String> set = new HashSet<>();

            set.add("Java");
            set.add("Python");
            set.add("C++");
            set.add("Java");   // Duplicate

            System.out.println(set);
        }
}
