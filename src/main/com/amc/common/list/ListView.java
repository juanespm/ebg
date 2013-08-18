package com.amc.common.list;

import java.io.Serializable;

import com.github.timoteoponce.paginator.Paginator;

/**
 * @author Alvaro Cardozo
 */
public interface ListView<T> extends Serializable {

    int DEFAULT_PAGE_SIZE = 5;

    /**
     * @return
     * @author Alvaro Cardozo
     */
    Paginator<T> getPaginator();

    void search();

    void refresh();

    void reset();

    /** Returns the list object */
    ListProviderCommon<T> getList();

    /**
     * Returns the form associated with the list.
     * 
     * @author Alvaro Cardozo
     */
    FormCommon getForm();

    /** Selects the entity */
    void setSelectedEntity(T object);

    /** Returns the selected entity */
    T getSelectedEntity();

    /** Cleans the selected Entity */
    void cleanSelection();

    /** Indicates if an item is already selected */
    boolean isSelected(T t);
}
