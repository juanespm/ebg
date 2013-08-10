package com.amc.ebg.dao;

import ch.swissbytes.commons.persistence.ComponentsFactory;
import ch.swissbytes.commons.persistence.CriteriaProvider;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Install;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

/**
 * @author Timoteo Ponce
 *
 */
@Scope(ScopeType.STATELESS)
@BypassInterceptors
@Name("daoFactory")
@Install(precedence = 0)
public class DaoFactory {

    private ComponentsFactory factory;

    public DaoFactory() {
    }

    public DaoFactory(final ComponentsFactory factory) {
        this.factory = factory;
    }

    private ComponentsFactory getFactory() {
        if (factory == null) {
            factory = new ComponentsFactory();
        }
        return factory;
    }

    /**
     * @return
     * @author Timoteo Ponce
     */
//    @Factory(value = UsersList.NAME, autoCreate = true, scope = ScopeType.PAGE)
//    public UsersList getUsersList() {
//        final CriteriaProvider criteriaProvider = getFactory().getInstance(EntityPersister.class);
//        return new UsersList(criteriaProvider);
//    }



}
