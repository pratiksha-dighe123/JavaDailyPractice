package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args){
        List<String> list= new ArrayList<>();

        list.add("Ram");
        list.add("Shyam");
        list.add("Priya");

        System.out.println("List elements:" + list);

    }
}
