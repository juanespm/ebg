package com.amc.ebg.dao.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;

import com.amc.ebg.dao.enumerator.StatusEnum;
import com.amc.ebg.domain.entities.Users;

/**
 * @author Alvaro Cardozo
 */

@Name(UserCredentials.NAME)
public class UserCredentials {

    public static final String NAME = "userCredentials";

    @Logger
    private Log logger;

    @In
    private EntityManager entityManager;

    public Users findUser(final String userName, final String password) {
        logger.debug("public Users findUser(final String userName=" + userName + ", final String password)");
        Users user = null;
        Query query = entityManager.createQuery(prepareQuery(userName, password));
        List list = (List) query.getResultList();
        if (!list.isEmpty()) {
            user = (Users) list.get(0);
        }
        return user;
    }

    private String prepareQuery(final String userName, final String password) {
        logger.debug("private String prepareQuery(final String userName, final String password)");
        StringBuilder querySql = new StringBuilder();
        querySql.append("SELECT user FROM Users user WHERE 1=1 ");
        querySql.append(" AND ");
        querySql.append(" LOWER (user.userName)='");
        querySql.append(userName.trim().toLowerCase());
        querySql.append("' AND ");
        querySql.append(" user.password='");
        querySql.append(password);
        querySql.append("'");
        querySql.append(" AND user.status.id<>'");
        querySql.append(StatusEnum.REMOVED.getId().longValue());
        querySql.append("'");
        return querySql.toString();
    }

}
