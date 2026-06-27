package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args){
//        List<String> list= new ArrayList<>();
//        list.add("Ram");
//        list.add("Shyam");
//        list.add("Priya");
//        System.out.println("List elements:" + list);

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
