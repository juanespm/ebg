package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;

import java.util.Date;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amc.ebg.domain.types.GenderType;
import com.amc.ebg.ws.operations.UserToken;

/**
 * @author Timoteo Ponce
 */
public class UnsubscribeCategoryActionTest extends JPAUnitTest {

//    private UnsubscribeCategoryAction action = new UnsubscribeCategoryAction(getPersister(), new FlyerActionLogger(getPersister()));

    private final UserToken clientToken = UserToken.of("clientToken" + System.currentTimeMillis());

//    private Consumer consumer;

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
//    public void testUnsubscriptionWithInvalidToken() {
//        assertTrue(action.execute(UserToken.of("invalidToken"), 1).isEmpty());
//    }
//
//    @Test
//    public void testUnsubscription() {
//        Long categoryId = 2L;
//        Category category = new Category();
//        category.setId(categoryId);
//        newSubscription(categoryId.intValue());
//        //
//        assertEquals(1, action.execute(clientToken, categoryId.intValue()).size());
//        List<CategorySubscription> subscriptions = new CategorySubscriptionList(getPersister()).
//                        withConsumer(consumer).withCategory(category).list();
//        assertTrue(subscriptions.isEmpty());
//    }
//
//    private void newSubscription(final int intValue) {
//        new SubscribeCategoryAction(getPersister()).execute(clientToken, intValue);
//    }
//
//    @Test
//    public void testMissingUnsubscription() {
//        Long categoryId = 4L;
//        assertTrue(action.execute(clientToken, categoryId.intValue()).isEmpty());
//    }
//
//    @Test(enabled=false)
//    public void testInvalidCategoryUnsubscription() {
//        Long categoryId = 2L;
//        Category category = new Category();
//        category.setId(categoryId);
//        newSubscription(categoryId.intValue());
//        //
//        assertTrue(action.execute(clientToken, 555).isEmpty());
//        List<CategorySubscription> subscriptions = new CategorySubscriptionList(getPersister()).withConsumer(consumer).withCategory(category).list();
//        assertFalse(subscriptions.isEmpty());
//    }

}
