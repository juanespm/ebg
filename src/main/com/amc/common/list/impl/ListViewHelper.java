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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.seam.annotations.Create;

import com.amc.common.list.ListView;
import com.github.timoteoponce.paginator.Paginator;

/**
 * @author Alvaro Cardozo
 */
public abstract class ListViewHelper<T> implements ListView<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected Log logger = LogFactory.getLog(getClass());

    private Paginator<T> paginator;

    @Create
    public void create() {
        logger.debug("create()");
        paginator = new Paginator<T>(getList(), DEFAULT_PAGE_SIZE);
    }

    @Override
    public Paginator<T> getPaginator() {
        return paginator;
    }

    @Override
    public void search() {
        logger.debug("search()");
        refresh();
    }

    @Override
    public void refresh() {
        logger.debug("refresh()");
        getPaginator().refresh();
    }

    @Override
    public void reset() {
        logger.debug("reset()");
        getList().clear();
        cleanSelection();
        refresh();
    }

    @Override
    public void cleanSelection() {
        logger.debug("cleanSelection()");
        setSelectedEntity(null);
    }

    @Override
    public boolean isSelected(T t) {
        logger.debug("public boolean isSelected(T t)");
        if (getSelectedEntity() != null) {
            return getSelectedEntity().equals(t);
        } else {
            return false;
        }

    }

}
