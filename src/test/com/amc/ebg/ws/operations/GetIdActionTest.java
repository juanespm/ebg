package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;

import org.jboss.seam.security.digest.DigestUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.amc.ebg.util.Passwords;

import com.amc.ebg.ws.operations.UserToken;

/**
 * @author Alvaro Cardozo.
 * 
 */
public class GetIdActionTest extends JPAUnitTest {

//    private GetIdAction action = new GetIdAction(getPersister());
//    private ConsumerList consumerList = new ConsumerList(getPersister());
//
//    @BeforeMethod
//    @BeforeClass
//    public void beforeClass() throws Exception {
//        clearData(FlyerLogEntry.class);
//        clearData(CategorySubscription.class);
//        clearData(Consumer.class);
//        consumerList.clear();
//    }
//
//    @Test
//    public void testGetFirstId() {
//        IDParamsType params = createParams();
//        UserToken token = action.execute(params);
//        Long id = consumerList.list().get(0).getId();
//        assertEquals(token.toString(), Passwords.hash(id.toString() + params.getName()
//            + params.getEmail()));
//        assertFalse(consumerList.withParams(params).list().isEmpty());
//    }
//
//    private IDParamsType createParams() {
//        IDParamsType params = new IDParamsType();
//        params.setEmail("email");
//        params.setGender(1);
//        params.setLastName("lastName-" + System.currentTimeMillis());
//        params.setName("name-" + System.currentTimeMillis());
//        return params;
//    }
//
//    @Test
//    public void testGetAlreadyExistentId() {
//        IDParamsType params = createParams();
//        UserToken token1 = action.execute(params);
//        UserToken token2 = action.execute(params);
//        assertEquals(token1, token2);
//        assertEquals(consumerList.withParams(params).list().size(), 1);
//    }
}
