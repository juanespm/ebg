package com.amc.ebg.ws.operations;

import org.apache.commons.lang.StringUtils;

/**
 * @author Timoteo Ponce
 */
public class UserToken {

    private final String value;

    private UserToken(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserToken other = (UserToken) obj;
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

    public static UserToken of(final String value) {
        return new UserToken(StringUtils.strip(value, "\"' "));
    }
}
