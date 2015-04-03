package zhiyuan.algorithm.base;

import java.util.NoSuchElementException;

/**
 * Created by mazhiyuan on 2015/4/1.
 */
public class Stack<I> implements Iterable<I> {
    private Node<I> first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(I i) {
        Node old = first;
        first = new Node();
        first.i = i;
        first.next = old;
        N++;
    }

    public I pop() {
        if (isEmpty())
            return null;
        I i = first.i;
        first = first.next;
        N--;
        return i;
    }

    @Override
    public Iterator iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {
        private Node<I> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            if(current==null)
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
