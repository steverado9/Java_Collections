import java.util.Iterator;

//Iterable inteface
public class GenericList<T> implements Iterable<T> {
    // T[] is an array
    //we are able to access array T[] outside this class cos it is public
    public T[] items = (T[]) new Object[10];
    //we should not expose the "items"(variable) outside cos it is the implementation detail
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    //This method returns an iterator
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }
    //implementing the interator as a private nexted class inside this generic list class
    private class ListIterator implements Iterator<T>{
        //T is the same T we use in the genericList
        private GenericList<T> list;
        private int index;

        //we should pass the generic list over a constructor
        public ListIterator(GenericList<T> list) {
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }

    }

}