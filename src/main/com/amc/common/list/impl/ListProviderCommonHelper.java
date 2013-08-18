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

package com.amc.common.list.impl;

import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amc.common.list.ListProviderCommon;
import com.amc.util.query.RestrictionsQuery;
import com.github.timoteoponce.paginator.Segment;
import com.github.timoteoponce.paginator.SegmentProvider;

/**
 * {@link ListProviderCommonHelper} is a class that will save several lines of
 * code that should be manually implemented everywhere if you try to create
 * classes that implement {@link ListProviderCommon} interface.
 * 
 * @author Alvaro Cardozo
 */
public abstract class ListProviderCommonHelper<T> implements ListProviderCommon<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private final RestrictionsQuery restrictionsQuery = new RestrictionsQuery();

    protected Log logger = LogFactory.getLog(getClass());

    /**
     * Method that must return the name of the entity as defined in the
     * MappedEntity, this will be used to generate the queries.
     */
    protected abstract String getEntityClassName();

    /**
     * @return the restrictionsQuery
     */
    public RestrictionsQuery getRestrictionsQuery() {
        return restrictionsQuery;
    }

    // /** Method that returns the logger of the implementor's class */
    // protected Log getLogger() {
    // return LogFactory.getLog(getClass());
    // }

    /**
     * Creates the query that will be used to get data. Note that the alias of
     * the Entity is "x" so take care of it at the moment of adding extra
     * parameters or conditions.
     * How is the order of execution ?
     * 1-The Select is created with the WHERE 1=1 clause.
     * 2-The method prepareFilter is been called.
     * 3-The restrictions parameters are updated, when calling the method
     * applyQueryParameters.
     * 4-The resulting query is returned.
     * 
     * @author Alvaro Cardozo
     * @param count if true, the query will only count the total of results
     * @return A {@link Query} object that has been formed according to the
     *         filter and parameters.
     */
    protected Query createQuery(boolean count) {
        logger.debug("createQuery(count=" + String.valueOf(count) + ")");
        StringBuilder strQuery = new StringBuilder();
        if (count) {
            strQuery.append("SELECT COUNT(DISTINCT x.id) FROM ");
            strQuery.append(getEntityClassName());
            strQuery.append(" x WHERE 1 = 1 ");
        } else {
            strQuery.append("SELECT x FROM ");
            strQuery.append(getEntityClassName());
            strQuery.append(" x WHERE 1 = 1 ");
        }

        logger.debug("preparing the filter...");
        prepareFilter(strQuery);
        Query query = getEntityPersister().getEntityManager().createQuery(strQuery.toString());

        logger.debug("updating parameters...");
        // FIXME avoid using this class...
        getRestrictionsQuery().updateParameters(query);
        applyQueryParameters(query);
        logger.debug("all parameters where applied...");
        return query;
    }

    /**
     * Prepares the filter that will be executed by the query. Here you should
     * add the extra conditions e.g. AND,OR,etc.
     */
    protected abstract void prepareFilter(StringBuilder strQuery);

    /** Applies the parameters of the queries. */
    protected abstract void applyQueryParameters(final Query query);

    @Override
    public List<T> provideList(SegmentProvider segmentProvider) {
        logger.debug("List<ItemTemplate> provideList(x)");
        int rowCount = getRowCount().intValue();
        Segment segment = segmentProvider.getSegment(rowCount);
        return list(segment);
    }

    @Override
    public Long getRowCount() {
        logger.debug("getRowCount()");
        Query query = createQuery(true);
        Number size = (Number) query.getSingleResult();
        logger.debug("size=" + size.longValue());
        return size.longValue();
    }

    @Override
    public void clear() {
        logger.debug("clear()");
        getFilter().clear();
    }

}
