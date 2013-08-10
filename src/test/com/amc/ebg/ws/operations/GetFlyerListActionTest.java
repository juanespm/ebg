package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amc.ebg.domain.dto.CategoryId;

import com.amc.ebg.domain.types.GenderType;

import com.amc.ebg.ws.operations.UserToken;

/**
 * @author Timoteo Ponce
 */
public class GetFlyerListActionTest extends JPAUnitTest {

//    private GetFlyerListAction action = new GetFlyerListAction(getPersister());
//
//    private final UserToken clientToken = UserToken.of("clientToken" + System.currentTimeMillis());
//
//    @Test
//    public void testListWithAValidToken() {
//        final int previousSize = action.execute(clientToken, CategoryId.of(1), EventType.TODAY).getFlyerList().size();
//        createFlyer();
//        createFlyer();
//        createFlyer();
//        List<FlyerType> list = action.execute(clientToken, CategoryId.of(1), EventType.TODAY).getFlyerList();
//        assertEquals(list.size(), previousSize + 3);
//        assertEntries(list);
//    }
//
//    @Test
//    public void testListWeekEvents() {
//        List<Flyer> newFlyers = new ArrayList<Flyer>();
//        final int previousSize = action.execute(clientToken, CategoryId.of(1), EventType.WEEK).getFlyerList().size();
//        newFlyers.add(createFlyer());
//        newFlyers.add(createFlyer());
//        try {
//            FlyerListType listType = action.execute(clientToken, CategoryId.of(1), EventType.WEEK);
//            List<FlyerType> list = listType.getFlyerList();
//            assertEquals(list.size(), previousSize + 2);
//            assertEntries(list);
//        } finally {
//            for (Flyer flyer : newFlyers) {
//                remove(flyer);
//            }
//        }
//    }
//
//    @Test
//    public void testListWeekFavoriteEvents() throws Exception {
//        List<Flyer> newFlyers = new ArrayList<Flyer>();
//        newFlyers.add(createFlyer());
//        newFlyers.add(createFlyer());
//        new MarkFavoriteAction(getPersister()).execute(clientToken, newFlyers.get(0).getId().intValue());
//        try {
//            FlyerListType listType = action.execute(clientToken, CategoryId.of(1), EventType.WEEK, true);
//            List<FlyerType> list = listType.getFlyerList();
//            assertEquals(list.size(), 1);
//            assertEntries(list);
//        } finally {
//            clearData(FavoriteFlyer.class);
//            for (Flyer flyer : newFlyers) {
//                remove(flyer);
//            }
//        }
//    }
//
//    private Flyer createFlyer() {
//        Flyer flyer = new Flyer();
//        flyer.setCategory(getPersister().find(Category.class, 1L));
//        flyer.setEventDate(new Date());
//        flyer.setExpirationDate(new DateTime().plusDays(2).toDate());
//        flyer.setFlyerStatus(getEnumEntity(FlyerStatusEnum.PUBLISHED));
//        flyer.setImageUrl("imageUrl");
//        flyer.setPublicationDate(new DateTime().minusDays(1).toDate());
//        flyer.setUsers(getPersister().find(Users.class, -1L));
//        flyer.setTitle("title");
//        flyer.setLocation(getPersister().find(Location.class, 1L));
//        persist(flyer);
//        return flyer;
//    }
//
//    private void assertEntries(final List<FlyerType> list) {
//        for (FlyerType item : list) {
//            assertNotNull(item.getId());
//            assertNotNull(item.getUrlOfFlyer());
//            assertNotNull(item.getTitle());
//            assertNotNull(item.getEventDate());
//        }
//        
//    }
//
//    @BeforeClass
//    public void beforeClass() throws Exception {
//        Consumer consumer = new Consumer(GenderType.MALE.id(), "name", "lastName", "email", clientToken.toString(), true, new Date());
//        persist(consumer);
//        clearData(FavoriteFlyer.class);
//    }
//
//    @Test
//    public void testListWithAnInvalidToken() {
//        FlyerListType listType = action.execute(UserToken.of("invalidToken"), CategoryId.of(1), EventType.TODAY);
//        assertNull(listType);
//    }

}
