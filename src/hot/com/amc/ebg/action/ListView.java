package com.amc.ebg.action;

import com.github.timoteoponce.paginator.Paginator;

import java.io.Serializable;

/**
 * @author Timoteo Ponce
 */
public interface ListView<T> extends Serializable {

    int DEFAULT_PAGE_SIZE = 5;

    /**
     * @return
     * @author Timoteo Ponce
     */
    Paginator<T> getPaginator();

    void search();

    void refresh();
}