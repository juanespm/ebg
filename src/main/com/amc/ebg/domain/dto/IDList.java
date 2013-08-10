package com.amc.ebg.domain.dto;

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Timoteo Ponce
 * @param <T>
 */
public class IDList<T> {
    private final Set<T> idList = new HashSet<T>();

    public static <T> IDList<T> of(final T... ids) {
        return new IDList<T>().with(ids);
    }

    public IDList<T> with(final T... ids) {
        for (T item : ids) {
            idList.add(item);
        }
        return this;
    }

    public String toJson() {
        return new Gson().toJson(idList);
    }

    public IDList<T> append(final T item) {
        return with(item);
    }

    public boolean isEmpty() {
        return idList.isEmpty();
    }

    public boolean contains(final T item) {
        return idList.contains(item);
    }

    public int size() {
        return idList.size();
    }
}
