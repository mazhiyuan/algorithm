package zhiyuan.algorithm.base;
import java.util.NoSuchElementException;

/**
 * Created by mazhiyuan on 2015/3/23.
 */
public class Bag<I> implements Iterable<I> {
    private Node<I> first;
    private int N;

    public void add(I i) {
        Node old = first;
        first = new Node<I>();
        first.i = i;
        first.next = old;
        N++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<I> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<I> {
        private Node<I> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public I next() {
            if (!hasNext())
                throw new NoSuchElementException();
            I i = current.i;
            current = current.next;
            return i;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
