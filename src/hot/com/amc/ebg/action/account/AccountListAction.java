package com.amc.ebg.action.account;

import ch.swissbytes.commons.persistence.Persister;

import com.amc.ebg.action.ListView;
import com.amc.ebg.dao.EntityPersister;
import com.github.timoteoponce.paginator.Paginator;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 * @author Timoteo Ponce
 */
@Name(AccountListAction.NAME)
@Scope(ScopeType.PAGE)
public class AccountListAction implements ListView {

    /**
     *
     */
    private static final long serialVersionUID = -3946353341148073066L;

    public static final String NAME = "accountListAction";

    private final AccountForm form = new AccountForm();

//    @In(create = true, value = AccountList.NAME)
//    private AccountList accountList;

    @In(create = true, value = EntityPersister.NAME)
    private Persister persister;

//    private Paginator<Account> paginator;

    @Create
    public void create() {
      //  paginator = new Paginator<Account>(accountList, DEFAULT_PAGE_SIZE);
    }

    public AccountForm getForm() {
        return form;
    }

//    @Override
//    public Paginator<Account> getPaginator() {
//        return paginator;
//    }

    @Override
    public void search() {
        refresh();
    }

@Override
public Paginator getPaginator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void refresh() {
	// TODO Auto-generated method stub
	
}

//    @Override
//    public void refresh() {
//        System.out.println(form.toString());
//        accountList.clear();
//        accountList.withAccount(form.toEntity()).withinPeriod(form.getPeriod());
//        paginator.refresh();
//    }

//    public void reset() {
//        form.clear();
//        refresh();
//    }
//
//    public String activate(final Account detachedAccount) {
//        changeStatus(detachedAccount, StatusEnum.ACTIVE);
//        return null;
//    }
//
//    public String deactivate(final Account detachedAccount) {
//        changeStatus(detachedAccount, StatusEnum.DISABLED);
//        return null;
//    }

//    private void changeStatus(final Account detachedAccount, final StatusEnum newStatus) {
//        Account account = persister.find(Account.class, detachedAccount.getId());
//        account.setStatus(newStatus.getEntity(persister));
//        persister.update(account);
//        refresh();
//    }

}
