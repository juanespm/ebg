package com.amc.ebg.dao.enumerator;

import java.util.EnumSet;

import ch.swissbytes.commons.persistence.EntityEnum;
import ch.swissbytes.commons.persistence.Persister;

import com.amc.ebg.domain.entities.Role;

public enum RoleEnum implements EntityEnum<Role> {

    ADMINISTRATOR(1, "ADMINISTRADOR"), TEAM(2, "HOTEL"), PLAYER(3, "JUGADOR");

    private Integer id;

    private String name;

    public static final EnumSet<RoleEnum> EMPTY_ENUMSET = EnumSet.noneOf(RoleEnum.class);

    public static final EnumSet<RoleEnum> DEFINED_ON_DB = EnumSet.of(ADMINISTRATOR, TEAM, PLAYER);

    RoleEnum(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equalsTo(Role role) {
        return this.id.toString().equals(role.getId().toString());

    }

    @Override
    public Role getEntity(Persister persister) {
        Role role = null;
        if (persister != null) {
            role = persister.find(Role.class, id.longValue());
        }
        return role;
    }

    @Override
    public Integer getId() {
        return id;
    }

}
