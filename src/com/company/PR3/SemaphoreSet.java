package com.company.PR3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreSet implements Set {

    ArrayList obj = new ArrayList();
    int size;
    int permits = 1;
    private Semaphore semaphore = new Semaphore(1, true);

    public SemaphoreSet(int size) {
        this.size = size;

    }

    @Override
    public int size() {
        int count = 0;
        try {
            Semaphore semaphore = new Semaphore(permits);
            semaphore.acquire();
            for (int i = 0; i < size; i++) {
                if (obj.get(i) != null) {
                    count = count + 1;
                }
            }
            semaphore.release();
        } catch (InterruptedException e) {
            count = 0;
            e.printStackTrace();
        } finally {
            permits++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
