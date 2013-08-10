package com.amc.ebg.action.faces;

import javax.faces.model.SelectItem;

/**
 * @author Timoteo Ponce
 * @param <T>
 */
public interface SelectItemCreator<T> {
    /**
     * @param argument
     * @author Timoteo Ponce
     */
    SelectItem create(T argument);
}