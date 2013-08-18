/*-*
 * FILENAME  :
 *    $HeadURL$
 *
 * STATUS  :
 *    $Revision$
 *
 *    $Author$
 *    $Date$
 *  
 *    
 * Copyright (c) 2006 SwissBytes Ltda. All rights reserved.
 *
 ****************************************************************/

package com.amc.common.list;

import java.util.List;

import com.amc.ebg.dao.EntityPersister;
import com.github.timoteoponce.paginator.ListProvider;
import com.github.timoteoponce.paginator.Segment;

/**
 * Interface created to avoid complexity of list management in order to put in
 * any list implementator all the common methods used for listing entities.
 * 
 * @author Alvaro Cardozo
 */
public interface ListProviderCommon<T> extends ListProvider<T> {

    /** Method Executed for clearing the list */
    void clear();

    /** Returns the related form of the list */
    FormCommon getFilter();

    /** Returns the total of rows find with the current filter. */
    Long getRowCount();

    /** Returns the list of Element from the segment */
    List<T> list(final Segment segment);

    /** Returns the entity persister that will interact with the DB-MODEL. */
    EntityPersister getEntityPersister();

}
