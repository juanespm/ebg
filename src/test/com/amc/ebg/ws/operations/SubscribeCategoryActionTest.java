package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;

import java.util.Date;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.amc.ebg.domain.dto.IDList;
import com.amc.ebg.domain.types.GenderType;
import com.amc.ebg.ws.operations.UserToken;

/**
 * @author Timoteo Ponce
 */
public class SubscribeCategoryActionTest extends JPAUnitTest {

//    private SubscribeCategoryAction action = new SubscribeCategoryAction(getPersister(), new FlyerActionLogger(getPersister()));
//
//    private final UserToken clientToken = UserToken.of("clientToken" + System.currentTimeMillis());
//
//    private Consumer consumer;
//
//    @BeforeClass
//    public void beforeClass() {
//        consumer = new Consumer(GenderType.MALE.id(), "name", "lastName", "email", clientToken.toString(), true, new Date());
//        persist(consumer);
//    }
//
//    @BeforeMethod
//    public void beforeMethod() throws Exception {
//        clearData(CategorySubscription.class);
//    }
//
//    @Test
//    public void testNewSubscriptionWithInvalidToken() {
//        assertTrue(action.execute(UserToken.of("invalidToken"), 1).isEmpty());
//    }
//
//    @Test
//    public void testNewSubscription() {
//        Long categoryId = 2L;
//        Category category = new Category();
//        category.setId(categoryId);
//        IDList<Integer> result = action.execute(clientToken, categoryId.intValue());
//        assertTrue(result.contains(categoryId.intValue()));
//        List<CategorySubscription> subscriptions = new CategorySubscriptionList(getPersister()).
//                        withConsumer(consumer).withCategory(category).list();
//        assertFalse(subscriptions.isEmpty());
//    }
//
//    @Test
//    public void testNewSubscriptions() {
//        IDList<Integer> result = action.execute(clientToken, 2, 3, 4);
//        assertEquals(3, result.size());
//    }
//
//    @Test
//    public void testDuplicateSubscription() {
//        Long categoryId = 2L;
//        Category category = new Category();
//        category.setId(categoryId);
//        action.execute(clientToken, categoryId.intValue());
//        action.execute(clientToken, categoryId.intValue());
//        List<CategorySubscription> subscriptions = new CategorySubscriptionList(getPersister()).
//                        withConsumer(consumer).withCategory(category).list();
//        assertEquals(subscriptions.size(), 1);
//    }
//
//    @Test
//    public void testInvalidCategorySubscription() {
//        Long categoryId = 222L;
//        Category category = new Category();
//        category.setId(categoryId);
//        assertTrue(action.execute(clientToken, categoryId.intValue()).isEmpty());
//        List<CategorySubscription> subscriptions = new CategorySubscriptionList(getPersister()).withConsumer(consumer).withCategory(category).list();
//        assertTrue(subscriptions.isEmpty());
//    }

}
