package com.amc.ebg.action.account;


import java.io.Serializable;

import com.amc.ebg.dao.period.Period;


/**
 * @author Timoteo Ponce
 */
public class AccountForm implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3128698740118530301L;

    private Long id;

  
    private String name;

    private final Period period = new Period();

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

//    public AccountTypeEnum getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(final AccountTypeEnum accountType) {
//        this.accountType = accountType;
//    }
//
//    public StatusEnum getStatus() {
//        return status;
//    }
//
//    public void setStatus(final StatusEnum status) {
//        this.status = status;
//    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Period getPeriod() {
        return period;
    }

//    public void fromEntity(final Account item) {
//        setId(item.getId());
//        setAccountType(AccountTypeEnum.of(item.getAccountType()));
//        // TODO complete
//    }
//
//    public Account toEntity() {
//        return toEntity(new Account());
//    }
//
//    public Account toEntity(final Account account) {
//        if (getAccountType() != null) {
//            account.setAccountType(getAccountType().getEntity(null));
//        }
//        account.setName(name);
//        if (getStatus() != null) {
//            account.setStatus(getStatus().getEntity(null));
//        }
//        return account;
//    }

//    public void clear() {
//        setAccountType(null);
//        setId(null);
//        setName(null);
//        period.clear();
//        setStatus(null);
//    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("AccountForm [id=");
//        builder.append(id);
//        builder.append(", accountType=");
//        builder.append(accountType);
//        builder.append(", status=");
//        builder.append(status);
//        builder.append(", name=");
//        builder.append(name);
//        builder.append(", period=");
//        builder.append(period);
//        builder.append("]");
//        return builder.toString();
//    }

}
