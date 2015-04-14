package zhiyuan.algorithm.base;

/**
 * Created by mazhiyuan on 2015/3/23.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}
