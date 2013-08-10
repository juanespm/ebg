package com.amc.ebg.dao;

import ch.swissbytes.commons.persistence.EntityEnum;
import ch.swissbytes.commons.persistence.Persister;

import javax.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;

/**
 * @author Alvaro Cardozo
 * 
 */
@Name(EntityPersister.NAME)
public class EntityPersister implements Persister {

    public static final String NAME = "entityPersisterL";

    public static final Persister NULL = new Persister() {
        @Override
        public <T> List<T> list(final Class<T> arg0) {
            return null;
        }

        @Override
        public <T> Criteria createCriteria(final Class<T> arg0) {
            return null;
        }

        @Override
        public <T> void update(final T arg0) {
        }

        @Override
        public <T> void remove(final T arg0) {
        }

        @Override
        public <T> void persist(final T arg0) {
        }

        @Override
        public <T> T load(final Class<T> arg0, final Object arg1) {
            return null;
        }

        @Override
        public <T> T getEntity(final EntityEnum<T> arg0) {
            return null;
        }

        @Override
        public <T> T find(final Class<T> arg0, final Object arg1) {
            return null;
        }
    };

    @In
    private EntityManager entityManager;

    public EntityPersister() {
    }

    public EntityPersister(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public <T> void persist(final T entity) {
        entityManager.persist(entity);
        entityManager.flush();
    }

    @Override
    public <T> void update(final T entity) {
        entityManager.flush();
    }

    @Override
    public <T> T getEntity(final EntityEnum<T> entityEnum) {
        return entityEnum.getEntity(this);
    }

    @Override
    public <T> Criteria createCriteria(final Class<T> entityClass) {
        final Session session = (Session) entityManager.getDelegate();
        return session.createCriteria(entityClass).setCacheable(true);
    }

    @Override
    public <T> List<T> list(final Class<T> entityClass) {
        return createCriteria(entityClass).list();
    }

    @Override
    public <T> T find(final Class<T> classDefinition, final Object id) {
        return entityManager.find(classDefinition, id);
    }

    @Override
    public <T> T load(final Class<T> classDefinition, final Object id) {
        final Session session = (Session) entityManager.getDelegate();
        return (T) session.load(classDefinition, (Serializable) id);
    }

    public <T> void persistOrUpdate(final T entity) {
        final Session session = (Session) entityManager.getDelegate();
        session.saveOrUpdate(entity);
    }

    @Override
    public <T> void remove(final T entity) {
        entityManager.remove(entity);
    }

}
