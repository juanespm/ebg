package com.amc.ebg.dao.user;

import java.util.List;

import javax.persistence.Query;

import com.amc.common.list.FormCommon;
import com.amc.common.list.impl.ListProviderCommonHelper;
import com.amc.ebg.dao.EntityPersister;
import com.amc.ebg.domain.entities.Users;
import com.github.timoteoponce.paginator.Segment;

public class UserList extends ListProviderCommonHelper<Users> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void applyQueryParameters(Query arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    protected String getEntityClassName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void prepareFilter(StringBuilder arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public FormCommon getFilter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Users> list(Segment segment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EntityPersister getEntityPersister() {
        // TODO Auto-generated method stub
        return null;
    }

}
