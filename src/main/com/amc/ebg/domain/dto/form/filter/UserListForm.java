package com.amc.ebg.domain.dto.form.filter;

import com.amc.ebg.dao.enumerator.RoleEnum;
import com.amc.ebg.dao.enumerator.StatusEnum;
import com.amc.ebg.domain.dto.form.FormCommon;

public class UserListForm implements FormCommon {

    private String userName;

    private StatusEnum statusEnum;

    private RoleEnum roleEnum;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public RoleEnum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void clear() {
        setUserName(null);
        setStatusEnum(null);
        setRoleEnum(null);
        setEmail(null);
    }

}
