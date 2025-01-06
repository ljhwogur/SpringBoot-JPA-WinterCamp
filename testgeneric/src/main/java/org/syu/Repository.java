package org.syu;

public interface Repository<T> {
    public void save(T item);
    public  T findById(int id);
}
