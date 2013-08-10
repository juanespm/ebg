package com.amc.ebg.action.user;

import ch.swissbytes.commons.persistence.Persister;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import com.amc.ebg.dao.EntityPersister;
import com.amc.ebg.session.UserCredentials;
import com.amc.ebg.util.Passwords;

/**
 * @author Timoteo Ponce
 */
@Name(ChangePwdAction.NAME)
@Scope(ScopeType.PAGE)
public class ChangePwdAction {
    public static final String NAME = "changePwdAction";

    @In
    private UserCredentials credentials;

    @In(create = true, value = EntityPersister.NAME)
    private Persister persister;

    private String pwd;

    private String pwdVerification;

    public String changePwd() {
//        Users user = persister.find(Users.class, credentials.getUser().getId());
//        user.setPassword(Passwords.hash(pwd));
//        persister.persist(user);
        return "success";
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }

    public String getPwdVerification() {
        return pwdVerification;
    }

    public void setPwdVerification(final String pwdVerification) {
        this.pwdVerification = pwdVerification;
    }

}
