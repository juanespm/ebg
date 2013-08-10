package com.amc.ebg.action.user;

import ch.swissbytes.commons.persistence.Persister;

import com.amc.ebg.action.ListView;
import com.amc.ebg.dao.EntityPersister;
import com.amc.ebg.dao.user.UserCredentials;

import com.github.timoteoponce.paginator.Paginator;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 * @author Timoteo Ponce
 */
@Name(UserListAction.NAME)
@Scope(ScopeType.PAGE)
public class UserListAction implements ListView {

    /**
     *
     */
    private static final long serialVersionUID = -3946353341148073066L;

    public static final String NAME = "userListAction";

    private final UserForm form = new UserForm();

    @In(create = true, value = UserCredentials.NAME)
    private UserCredentials usersList;

    @In(create = true, value = EntityPersister.NAME)
    private Persister persister;

//    private Paginator<Users2> paginator;

//    @Create
//    public void create() {
//        paginator = new Paginator<Users2>(usersList, DEFAULT_PAGE_SIZE);
//    }

    public UserForm getForm() {
        return form;
    }

//    @Override
//    public Paginator<Users2> getPaginator() {
//        return paginator;
//    }

    @Override
    public void search() {
        refresh();
    }

    @Override
    public void refresh() {
//        usersList.clear();
//        usersList
//            .withUser(form.toEntity())
//            .withGeneralName(form.getName())
//            .withinPeriod(form.getPeriod());
//        paginator.refresh();
    }

    public void reset() {
        form.clear();
        refresh();
    }

	@Override
	public Paginator getPaginator() {
		// TODO Auto-generated method stub
		return null;
	}

//    public String activate(final Users2 detachedUser) {
//        changeStatus(detachedUser, StatusEnum.ACTIVE);
//        return null;
//    }

//    public String deactivate(final Users2 detachedUser) {
//        changeStatus(detachedUser, StatusEnum.DISABLED);
//        return null;
//    }

//    private void changeStatus(final Users2 detachedUser, final StatusEnum newStatus) {
//        Users2 user = persister.find(Users2.class, detachedUser.getId());
//       // user.setStatus(newStatus.getEntity(persister));
//        persister.update(user);
//        refresh();
//    }

}
