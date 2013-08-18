package com.amc.common.crud;

import java.io.Serializable;

import com.amc.common.list.FormCommon;

/**
 * Defines methods that should be agregated to the selected entity that is being
 * edited on CRUD forms.
 * 
 * @author Alvaro Cardozo.
 */
public interface EntityFormCRUD extends FormCommon {

    Serializable getRealEntity();

    void setRealEntity(Serializable entity);

    void copyChangesFromTemporaryObjectToRealEntity();

    FormCommon getTemporaryObject();

    void setTemporaryObject(FormCommon temporaryObject);

    boolean isRealEntityNull();

}
