package collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        //a collection of type string
        //set to a new instance of array list
        Collection<String> collection = new ArrayList<>();
//        //add items to the collection
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        System.out.println(collection);
//        for (var item : collection)
//            System.out.println(item);
        //add items in the collection using addAll() method
        Collections.addAll(collection, "a", "b", "c");
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other)); //checking if two collections are equal

//        collection.remove("a"); //removes a single method
//        collection.clear(); //removes all element in a collection
//        //convert the collection to an array
//        var objectArray = collection.toArray();
//        var stringArray = collection.toArray(new String[0]);
//        var containA = collection.contains("a");
//        System.out.println(containA);
//        System.out.println(collection.size()); //check the size of the collection
//        System.out.println(collection.isEmpty()); //check if collection is empty

    }
}
