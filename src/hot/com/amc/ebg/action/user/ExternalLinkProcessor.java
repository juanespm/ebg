package com.amc.ebg.action.user;

import ch.swissbytes.commons.persistence.Persister;

import java.util.List;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.security.Identity;

import com.amc.ebg.dao.EntityPersister;
//import com.amc.ebg.dao.LinkHashList;
//import com.amc.ebg.domain.entities.LinkHash;
//import com.amc.ebg.domain.types.LinkActionEnum;
import com.amc.ebg.session.UserCredentials;

/**
 * @author Timoteo Ponce
 */
@Name(ExternalLinkProcessor.NAME)
public class ExternalLinkProcessor {

    public static final String NAME = "externalLinkProcessor";

    private Integer userId;

    private String token;

//    private LinkActionEnum action;

    @In
    private Identity identity;

    @In(create = true, value = EntityPersister.NAME)
    private Persister persister;

//    public String process() {
////        List<LinkHash> list = new LinkHashList(persister)
////            .withUserId(userId.longValue())
////            .withToken(token)
////            .withAction(action).list();
////        String result = "failed";
////        if (!list.isEmpty()) {
////            LinkHash link = list.get(0);
////            UserCredentials credentials = (UserCredentials) identity.getCredentials();
////            credentials.setForceLogin(true);
////            result = action.execute(identity, link);
////            persister.remove(link);
////        }
//        return result;
//    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

//    public LinkActionEnum getAction() {
//        return action;
//    }
//
//    public void setAction(final LinkActionEnum action) {
//        this.action = action;
//    }

}
