package com.amc.ebg.dao;

import ch.swissbytes.commons.persistence.CriteriaProvider;
import ch.swissbytes.commons.persistence.EntityList;
import ch.swissbytes.commons.persistence.Enums;

import java.util.EnumSet;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;



/**
 * @author Timoteo Ponce
 */
public abstract class AbstractEntityList<T> extends EntityList<T> {

    /**
     * 
     */
    private static final long serialVersionUID = -4681332174584096378L;

//    private EnumSet<StatusEnum> statuses = StatusEnum.EMPTY_ENUMSET;

    private Long id;

    public AbstractEntityList(final CriteriaProvider criteriaProvider, final Class<T> entityClass) {
        super(criteriaProvider, entityClass);
    }

//    @Override
//    protected void setRestrictions(final Criteria criteria) {
//        if (!statuses.isEmpty()) {
//            criteria.createAlias("status", "status");
//            criteria.add(Restrictions.in("status.id", Enums.toIdList(statuses)));
//        }
//        if (id != null) {
//            criteria.add(Restrictions.idEq(id));
//        }
//    }

//    public <K extends EntityList<T>> K withStatuses(final EnumSet<StatusEnum> statuses) {
//        this.statuses = statuses;
//        return (K) this;
//    }
//
//    public <K extends EntityList<T>> K withStatus(final StatusEnum status) {
//        this.statuses = (status == null ? StatusEnum.EMPTY_ENUMSET : EnumSet.of(status));
//        return (K) this;
//    }
//
//    public EntityList<T> clear() {
//        this.statuses = StatusEnum.EMPTY_ENUMSET;        
//        return this;
//    }

    public EntityList<T> withId(final Long id) {
        this.id = id;
        return this;
    }

}
