package com.amc.ebg.action.faces;

import ch.swissbytes.common.factory.BaseFactory;
import ch.swissbytes.commons.persistence.Enums;

import javax.faces.model.SelectItem;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;


import com.amc.ebg.dao.EntityPersister;
import com.amc.ebg.domain.types.PeriodType;


/**
 * @author Timoteo Ponce
 */
@AutoCreate
@Name(SelectItemsProvider.NAME)
public class SelectItemsProvider {

    public static final String NAME = "selectItemsProvider";

    private static final SelectItem NULL_ITEM = new SelectItem(null, "...");

    private final BaseFactory<String, SelectItemCreator<?>> itemsCreatorsFactory = new BaseFactory<String, SelectItemCreator<?>>();
    {
//        itemsCreatorsFactory.addTarget(Category.class.getName(), CategoryItemCreator.class);
//        itemsCreatorsFactory.addTarget(Roles.class.getName(), GenericItemCreator.class);
//        itemsCreatorsFactory.addTarget(Location.class.getName(), GenericItemCreator.class);
//        itemsCreatorsFactory.addTarget(Account.class.getName(), GenericItemCreator.class);
    }

    @In(create = true, value = EntityPersister.NAME)
    private EntityPersister persister;

    public List<SelectItem> getFlyerPeriodTypes() {
        return getEnumItems(PeriodType.FLYER_PERIODS, false);
    }

    public List<SelectItem> getAccountPeriodTypes() {
        return getEnumItems(PeriodType.ACCOUNT_PERIODS, false);
    }

    public List<SelectItem> getCommonPeriodTypes() {
        return getEnumItems(PeriodType.COMMON_PERIODS, false);
    }

//    public List<SelectItem> getFlyerStatuses() {
//        return getEnumItems(FlyerStatusEnum.class);
//    }
//
//    public List<SelectItem> getAccountTypes() {
//        return getEnumItems(AccountTypeEnum.class);
//    }

//    public List<SelectItem> getRoles() {
//        return getEnumItems(RolesEnum.class);
//    }
//
//    public List<SelectItem> getStatuses() {
//        return getEnumItems(StatusEnum.class);
//    }

//    public List<SelectItem> getCategories() {
//        return getEntityItems(Category.class);
//    }
//
//    public List<SelectItem> getAccounts() {
//        return getEntityItems(Account.class,false);
//    }


//    public List<SelectItem> getAvailableRoles(final String roleType) {
//    	RolesEnum role = RolesEnum.valueOf(roleType);
//    	List<SelectItem> list = Enums.toSelectItems(role.availableRoles());
//        return list;
//    }

//    public List<SelectItem> getUserCategories(final Users user) {
//        List<Category> list = new CategoryList(persister)
//            .withPublisher(user)
//            .beingLeaf(true)
//            .withStatus(StatusEnum.ACTIVE)
//            .list();
//        return getEntityItems(list, Category.class,false);
//    }
//
//    public List<SelectItem> getAccountLocations(final Account account) {
//        List<Location> list = new LocationList(persister)
//            .withAccount(account)
//            .list();
//        return getEntityItems(list, Location.class ,false);
//    }

    public <T>SelectItem getSingleItem(final String className,final Integer id) throws ClassNotFoundException {
        Object item = persister.find(Class.forName(className), id.longValue());
        if( item == null ){
        	return NULL_ITEM;
        }else{
        	SelectItemCreator<T> itemCreator = (SelectItemCreator<T>) itemsCreatorsFactory.getInstanceFor(className);
        	return itemCreator.create((T) item);
        }
    }

    /*******/

    private <T> List<SelectItem> getEntityItems(final List<T> list, final Class<T> entityClass,final boolean addNullEntry) {
        List<SelectItem> items = new ArrayList<SelectItem>();
        if(addNullEntry){
            items.add(NULL_ITEM);
        }
        addEntitiesToList(entityClass, items, list);
        return items;
    }

    private <T> List<SelectItem> getEntityItems(final Class<T> entityClass) {
        return getEntityItems(entityClass,true);
    }

    private <T> List<SelectItem> getEntityItems(final Class<T> entityClass,final boolean addNullItem) {
        List<SelectItem> items = new ArrayList<SelectItem>();
        if(addNullItem){
        	items.add(NULL_ITEM);
        }
        addEntityItems(entityClass, items);
        return items;
    }

    private <T> void addEntityItems(final Class<T> entityClass, final List<SelectItem> items) {
        final List<T> list = persister.list(entityClass);
        addEntitiesToList(entityClass, items, list);
    }

    private <T> void addEntitiesToList(final Class<T> entityClass, final List<SelectItem> items, final List<T> list) {
        final SelectItemCreator<T> selectItemCreator = (SelectItemCreator<T>) itemsCreatorsFactory.getInstanceFor(entityClass.getName());
        for (final T item : list) {
            items.add(selectItemCreator.create(item));
        }
    }

    /**
     * @param <T>
     * @param enumClass
     * @return
     * @author Timoteo Ponce
     */
    private <T extends Enum<T>> List<SelectItem> getEnumItems(final Class<T> enumClass) {
        return getEnumItems(enumClass, true);
    }

    private <T extends Enum<T>> List<SelectItem> getEnumItemsWithoutNullEntries(final Class<T> entityClass) {
        return getEnumItems(entityClass, false);
    }

    private <T extends Enum<T>> List<SelectItem> getEnumItems(final Class<T> entityClass, final boolean addNullItem) {
        final EnumSet<T> values = EnumSet.allOf(entityClass);
        List<SelectItem> items = Enums.toSelectItems(values);
        if (addNullItem) {
            items.add(0, NULL_ITEM);
        }
        return items;
    }

    private <T extends Enum<T>> List<SelectItem> getEnumItems(final EnumSet<T> enumSet, final boolean addNullItem) {
        List<SelectItem> items = Enums.toSelectItems(enumSet);
        if (addNullItem) {
            items.add(0, NULL_ITEM);
        }
        return items;
    }

}
