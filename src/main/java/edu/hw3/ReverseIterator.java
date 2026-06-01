package edu.hw3;

import java.util.List;
import java.util.ListIterator;

public class ReverseIterator<T> {

    private final List<T> list;
    private final ListIterator<T> iterator;

    public ReverseIterator(List<T> list) {
        this.list = list;
        this.iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public boolean hasNext() {
        return iterator.hasPrevious();
    }

    public T next() {
        return iterator.previous();
    }

    }

