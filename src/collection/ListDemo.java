package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        //add all items at once
        Collections.addAll(list, "a", "b", "c");
        //get an element by it's index
        System.out.println(list.get(0));
        //replace an object using it's index
        System.out.println(list.set(0, "a+"));
        //remove an item by its index
        list.remove(0);
        //getting the first occurence of the index of an item
        System.out.println(list.indexOf("a"));
        //getting the last occurence of the index of an item
        System.out.println(list.lastIndexOf("a"));
        //geiing the items inbetween a list
        System.out.println(list.subList(0, 2));
        //to add a few items
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!  ");
        System.out.println(list);


    }
}
