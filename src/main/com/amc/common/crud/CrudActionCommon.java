package com.amc.common.crud;

/**
 * Interface that defines common methods and behavior that should contain a CRUD
 * form from ASAC.
 * 
 * @author Alvaro Cardozo
 */
public interface CrudActionCommon {

    /** Entity that will be affected during CRUD operations. */
    EntityFormCRUD getEntityFormCRUD();

    void create();

    void read();

    void update();

    void delete();

}
