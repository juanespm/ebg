package com.amc.ebg.action.dashboard;

import ch.swissbytes.commons.persistence.CriteriaProvider;

import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;


import com.amc.ebg.dao.EntityPersister;

import com.amc.ebg.dao.user.UserCredentials;



/**
 * @author Timoteo Ponce
 */
@Name(DashboardForm.NAME)
public class DashboardForm {

    public static final String NAME = "dashboardForm";

    // flyers
    private Integer flyersPublished;

    private Integer flyersReadyToPublish;

    private Integer flyersExpired;

    private Integer flyersTotal;

    // publishers
    private Integer usersActive;

    private Integer usersInactive;

    private Integer usersRemoved;

    private Integer usersTotal;

    // categories
    private Integer categoriesActive;

    private Integer categoriesInactive;

    private Integer categoriesRemoved;

    private Integer categoriesTotal;

    @In(create = true, value = EntityPersister.NAME)
    private CriteriaProvider criteriaProvider;

    @Create
    public void create() {
        fetchFlyers();
        fetchPublishers();
        fetchCategories();
    }

    private void fetchCategories() {
//        CategoryList list = new CategoryList(criteriaProvider);
//        categoriesTotal = list.count();
//        categoriesActive = list.withStatus(StatusEnum.ACTIVE).count();
//        categoriesInactive = list.withStatus(StatusEnum.DISABLED).count();
//        categoriesRemoved = list.withStatus(StatusEnum.DELETED).count();
    }

    private void fetchPublishers() {
//        UsersList list = new UsersList(criteriaProvider);
//        usersTotal = list.count();
//        usersActive = list.withStatus(StatusEnum.ACTIVE).count();
//        usersInactive = list.withStatus(StatusEnum.DISABLED).count();
//        usersRemoved = list.withStatus(StatusEnum.DELETED).count();
    }

    private void fetchFlyers() {
//        FlyerList list = new FlyerList(criteriaProvider);
//        flyersTotal = list.count();
//        flyersExpired = list.withStatus(FlyerStatusEnum.EXPIRED).count();
//        flyersPublished = list.withStatus(FlyerStatusEnum.PUBLISHED).count();
//        flyersReadyToPublish = list.withStatus(FlyerStatusEnum.READY_TO_PUBLISH).count();
    }

    public Integer getFlyersPublished() {
        return flyersPublished;
    }

    public Integer getFlyersReadyToPublish() {
        return flyersReadyToPublish;
    }

    public Integer getFlyersExpired() {
        return flyersExpired;
    }

    public Integer getFlyersTotal() {
        return flyersTotal;
    }

    public Integer getUsersActive() {
        return usersActive;
    }

    public Integer getUsersInactive() {
        return usersInactive;
    }

    public Integer getUsersRemoved() {
        return usersRemoved;
    }

    public Integer getUsersTotal() {
        return usersTotal;
    }

    public Integer getCategoriesActive() {
        return categoriesActive;
    }

    public Integer getCategoriesInactive() {
        return categoriesInactive;
    }

    public Integer getCategoriesRemoved() {
        return categoriesRemoved;
    }

    public Integer getCategoriesTotal() {
        return categoriesTotal;
    }

}
