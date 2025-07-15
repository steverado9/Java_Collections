import java.util.Collection;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collection.addAll(collection,"a", "b", "c" );
        var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection == equals(other));


    }
}
