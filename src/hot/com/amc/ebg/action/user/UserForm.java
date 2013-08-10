package com.amc.ebg.action.user;


import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.amc.ebg.dao.period.Period;

import com.amc.ebg.session.UserCredentials;

/**
 * @author Timoteo Ponce
 */
public class UserForm implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7647550588884086118L;

    private Long id;

    private String name;

    private String email;

    private String pwd;

    private String pwdVerification;

    private boolean generatePassword;

//    private StatusEnum status;
//
//    private RolesEnum role;

    private Long locationId;

//    private AccountTypeEnum accountType;

    private Long accountId;

    private final Period period = new Period();

    public Period getPeriod() {
        return period;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

//    public StatusEnum getStatus() {
//        return status;
//    }
//
//    public void setStatus(final StatusEnum status) {
//        this.status = status;
//    }
//
//    public AccountTypeEnum getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(final AccountTypeEnum accountType) {
//        this.accountType = accountType;
//    }

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

//    public RolesEnum getRole() {
//        return role;
//    }
//
//    public void setRole(final RolesEnum role) {
//        this.role = role;
//    }

    public boolean isGeneratePassword() {
        return generatePassword;
    }

    public void setGeneratePassword(final boolean generatePassword) {
        this.generatePassword = generatePassword;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(final Long accountId) {
        this.accountId = accountId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(final Long locationId) {
        this.locationId = locationId;
    }

    public void clear() {
//        setId(null);
//        setName(null);
//        setAccountType(null);
//        setRole(null);
//        setStatus(null);
//        period.clear();
    }

//    public Users2 toEntity() {
//        return toEntity(new Users2());
//    }

    public void takeDefaults(final UserCredentials credentials) {
       // setAccountId(credentials.getAccount().getId());
    }

    public boolean isBasicDataFilled() {
    	return false;
       // return getAccountId() != null && getRole() != null && StringUtils.isNotBlank(getName()) && (isGeneratePassword() ? true : StringUtils.isNotBlank(getPwd()));
    }

//    public void fromEntity(final Users2 item) {
//      //  setId(item.getId());
////       // setAccountId(item.getAccount().getId());
////        setEmail(item.getEmail());
////        setLocationId(item.getLocation().getId());
////        setName(item.getUserName());
////        setPwd(item.getPassword());
////        setPwdVerification(getPwd());
////        setRole(RolesEnum.of(item.getRoles()));
//    }

//    public Users2 toEntity(final Users2 user) {
//        if (getRole() != null) {
//           // user.setRoles(getRole().getEntity(null));
//        }
//        if (getAccountType() != null) {
////            Account account = new Account();
////            account.setAccountType(getAccountType().getEntity(null));
////            user.setAccount(account);
//        }
//        if (getStatus() != null) {
//           // user.setStatus(getStatus().getEntity(null));
//        }
//        return user;
//    }

}
