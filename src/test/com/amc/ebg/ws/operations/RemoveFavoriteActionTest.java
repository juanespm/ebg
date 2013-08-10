package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;

import java.util.Date;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.amc.ebg.domain.dto.IDList;
import com.amc.ebg.domain.types.GenderType;
import com.amc.ebg.ws.operations.UserToken;

/**
 * @author Timoteo Ponce
 */
public class RemoveFavoriteActionTest extends JPAUnitTest {

//    private RemoveFavoriteAction action = new RemoveFavoriteAction(getPersister());

    private final UserToken clientToken = UserToken.of("clientToken" + System.currentTimeMillis());

//    private Consumer consumer;

    @BeforeClass
    public void beforeClass() throws Exception {
//        clearData(FavoriteFlyer.class);
//        consumer = new Consumer(GenderType.MALE.id(), "name", "lastName", "email", clientToken.toString(), true, new Date());
//        persist(consumer);
//        new MarkFavoriteAction(getPersister()).execute(clientToken, 1, 2);
    }

//    @Test
//    public void testWithInvalidToken() {
//        assertTrue(action.execute(UserToken.of("invalidToken"), 1).isEmpty());
//    }
//
//   // @Test
//    public void testRemoveFavorite() {
//        IDList<Integer> result = action.execute(clientToken, 1);
//        assertTrue(result.contains(1));
//        List<FavoriteFlyer> list = new FavoriteFlyerList(getPersister()).withConsumer(consumer).list();
//        assertEquals(list.size(), 1);
//    }

   // @Test
//    public void testRemoveInvalidFavorite() {
//        IDList<Integer> result = action.execute(clientToken, 1);
//        assertFalse(result.contains(1));
//        List<FavoriteFlyer> list = new FavoriteFlyerList(getPersister()).withConsumer(consumer).list();
//        assertEquals(list.size(), 1);
//    }

}
