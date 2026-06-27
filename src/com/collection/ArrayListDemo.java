package com.collection;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.set(1, "Spring");

        System.out.println(list);

        list.remove("C++");

        System.out.println(list);

        System.out.println(list.contains("Java"));

        System.out.println(list.size());
    }
}