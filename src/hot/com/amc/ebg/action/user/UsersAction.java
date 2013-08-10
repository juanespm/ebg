package com.amc.ebg.action.user;

import java.util.Date;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.StatusMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amc.ebg.business.user.UserPersister;
import com.amc.ebg.dao.EntityPersister;

import com.amc.ebg.session.UserCredentials;

import ch.swissbytes.commons.persistence.Persister;

/**
 * @author Timoteo Ponce
 */
@Name(UsersAction.NAME)
@Scope(ScopeType.CONVERSATION)
public class UsersAction {

    public static final String NAME = "usersAction";

    private static final Logger LOG = LoggerFactory.getLogger(UsersAction.class);

    private final UserForm form = new UserForm();

    //TODO do you need the persister?
    @In(create = true, value = EntityPersister.NAME)
    private Persister persister;
    
    @In(create = true, value = UserPersister.NAME)
    private UserPersister userPersister;

    @In
    private UserCredentials credentials;
    
    @In
    private StatusMessages statusMessages;

    private Long id;

    public void wire() {
        if (form.getId() == null && getIsModification()) {
            LOG.info("Wiring : " + id);
//            Users2 item = persister.find(Users2.class, id);
           // form.fromEntity(item);
        }else{
        	form.takeDefaults(credentials);
        }
    }

    public String next() {
        return "next";
    }

    public String next2() {        
        return "next";
    }
    
    public String save(){
//    	Users2 user = getEntity();
//    	userPersister.persist(user, form.isGeneratePassword());
//    	statusMessages.add("user.successfullySaved");
    	return "success";
    }

//    private Users2 getEntity() {
//    	Users2 user = getIsModification() ? persister.find(Users2.class, getId()) : new Users2();
//    	form.toEntity(user);
//    	//user.setAccount(persister.find(Account.class, form.getAccountId()));
//    	//user.setEmail(form.getEmail());
//    	//user.setLocation(persister.find(Location.class, form.getLocationId()));
//    	user.setPassword(form.getPwd());
//    	///user.setRegistrationDate(new Date());
//    	//user.setUserName(form.getName());
//    	//user.setRoles(form.getRole().getEntity(persister));    	
//    	return user;
//    }


    public UserForm getForm() {
        return form;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public boolean getIsModification() {
        return id != null && id > 0;
    }

}
