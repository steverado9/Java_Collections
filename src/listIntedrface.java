import java.util.Collection;

public class listIntedrface {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collection.addAll(list, "a", "b", "c");
        list.set(0, "a+");
        list.remove(0);
        System.Out.println(list.indexOf("a+"));
        System.Out.println(list.subList(0, 2));

    }
}
