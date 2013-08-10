package com.amc.ebg.dao;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;

import java.util.Date;
import java.util.EnumSet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amc.ebg.dao.user.UserCredentials;
import com.amc.ebg.util.Passwords;

/**
 * @author Alvaro Cardozo
 *
 */
public class UsersListTest extends JPAUnitTest{

//    private final UsersList list = new UsersList(getPersister());

//    private final int initialSize = list.count();

    @BeforeClass
    public void beforeClass() throws Exception {
//        Date date = new Date();
//        Account account = getPersister().find(Account.class, 1L);
//        String pwd = Passwords.hash("password");
//        Users user1 = new Users(getEnumEntity(RolesEnum.ADMINISTRATOR), getEnumEntity(StatusEnum.ACTIVE), account, "userName", pwd, "email", date, date);
//        Users user2 = new Users(getEnumEntity(RolesEnum.ADMINISTRATOR), getEnumEntity(StatusEnum.DELETED), account, "userName", pwd, "email", date, date);
//        persist(user1,user2);
    }

    @AfterMethod
    public void afterMethod() {
       // list.clear();
    }

    @Test
    public void testListWithoutStatus(){
//        assertEquals(list.count(), initialSize + 2);
    }

    @Test
    public void testListWithStatus() {
//        list.withStatuses(EnumSet.of(StatusEnum.ACTIVE));
//        assertEquals(list.count(), initialSize + 1);
//
//        list.withStatuses(EnumSet.of(StatusEnum.DISABLED));
//        assertEquals(list.count(), 0);
    }
    
//    @Test
//    public void testListWithPassword() {
//        list.withPassword("password");        
//        assertEquals(list.count(), initialSize + 2);
//    }
}
