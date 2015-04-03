package zhiyuan.algorithm.base;

import java.util.NoSuchElementException;

/**
 * Created by mazhiyuan on 2015/4/1.
 */
public class Queue<I> implements Iterable<I> {
    private Node<I> first;
    private Node<I> last;
    private int N;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(I i) {
        Node old = last;
        last = new Node();
        last.i = i;
        if (isEmpty()) first = last;
        else old.next = last;
        N++;
    }

    public I dequeue() {
        if (isEmpty())
            return null;
        I i = first.i;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return i;
    }

    @Override
    public Iterator<I> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<I> {
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
