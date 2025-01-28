package edu.hw3;

import java.util.Iterator;
import java.util.List;

public class ReverseIterator<T> implements Iterator<T> {
    private final List<T> originalCollection;
    private int index;

    public ReverseIterator(List<T> originalCollection) {
        this.originalCollection = originalCollection;
        this.index = originalCollection.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        return originalCollection.get(index--);
    }
}





