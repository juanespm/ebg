package com.amc.ebg.dao.enumerator;

import java.util.EnumSet;

import ch.swissbytes.commons.persistence.EntityEnum;
import ch.swissbytes.commons.persistence.Persister;

import com.amc.ebg.domain.entities.Status;

public enum StatusEnum implements EntityEnum<Status>{

    ACTIVE(1, "ACTIVO"), INACTIVE(2, "INACTIVO"), REMOVED(3, "ELIMINADO");

    private Integer id;

    private String name;

    public static final EnumSet<StatusEnum> EMPTY_ENUMSET = EnumSet.noneOf(StatusEnum.class);

    public static final EnumSet<StatusEnum> DEFINED_ON_DB = EnumSet.of(ACTIVE, INACTIVE, REMOVED);

    StatusEnum(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equalsTo(final Status status) {
        return this.id.toString().equals(status.getId().toString());
    }

    @Override
    public Status getEntity(final Persister persister) {
        Status status = null;
        if (persister != null) {
            status = persister.find(Status.class, id.longValue());
        }
        return status;
    }

    public static StatusEnum of(final Status userStatus) {
        return valueOf(userStatus.getName());
    }

    public static StatusEnum getStatusEnum(final String statusLabel) {
        StatusEnum statusEnum = null;
        statusEnum = valueOf(statusLabel);
        return statusEnum;
    }
}
