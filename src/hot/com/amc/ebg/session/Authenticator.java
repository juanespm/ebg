package com.amc.ebg.session;

import org.apache.commons.lang.StringUtils;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

import com.amc.ebg.dao.enumerator.StatusEnum;
import com.amc.ebg.dao.user.UserCredentials;
import com.amc.ebg.domain.entities.Users;
import com.amc.ebg.util.Encrypter;

/**
 * @author Alvaro Cardozo
 */
@Name("authenticator")
public class Authenticator {

    @In
    private Identity identity;

    @Logger
    private Log logger;

    @In(create = true)
    private UserCredentials userCredentials;

    public boolean authenticate() {
        logger.debug("public boolean authenticate()");
        logger.debug("trying to login [" + identity.getCredentials().getUsername().toLowerCase() + "," + StringUtils.repeat("*", identity.getCredentials().getPassword().length()) + "]");
        Credentials credentials = identity.getCredentials();
        Users user = userCredentials.findUser(credentials.getUsername().toLowerCase(), Encrypter.convertToMD5(credentials.getPassword()));
        if (user != null) {
            if (user.getStatus().getId().longValue() == StatusEnum.ACTIVE.getId().longValue()) {
                logger.info("user [" + user.getUserName() + "] authenticated !");
                return true;
            }
            logger.debug("user inactive [" + user.getUserName() + "]");
        }
        return false;
    }

}
