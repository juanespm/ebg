/*-*
 * FILENAME  :
 *    $HeadURL$
 *
 * STATUS  :
 *    $Revision$
 *
 *    $Author$
 *    $Date$
 *  
 *    
 * Copyright (c) 2006 SwissBytes Ltda. All rights reserved.
 *
 ****************************************************************/

package com.amc.util.query;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.apache.commons.lang.StringUtils;

/**
 * @author Alvaro Cardozo
 */
public class RestrictionsQuery {

    private static final String Q_BETWEEN = " BETWEEN ";

    private static final String Q_NOT_BETWEEN = " NOT BETWEEN ";

    private static final String Q_AND = "AND";

    private static final String Q__AND_ = " AND ";

    private static final String Q__OR_ = " OR ";

    public static final char LIKE = '%';

    private final Map<String, RestrictionValue> parameters = new HashMap<String, RestrictionValue>();

    public void clear() {
        parameters.clear();
    }

    private final String createNewParam(Object value) {
        return createNewParam(value, null);
    }

    private final String createNewParam(final Object value, final TemporalType dateType) {
        final String nameParam = "Param_" + parameters.size();
        parameters.put(nameParam, new RestrictionValue(value, dateType));
        return ":" + nameParam;
    }

    public void updateParameters(final Query query) {
        for (Entry<String, RestrictionValue> parameter : parameters.entrySet()) {
            final Object value = parameter.getValue().getValue();
            final TemporalType dateType = parameter.getValue().getDateType();

            if (dateType != null && value instanceof Date) {
                query.setParameter(parameter.getKey(), (Date) value, dateType);

            } else if (dateType != null && value instanceof Calendar) {
                query.setParameter(parameter.getKey(), (Calendar) value, dateType);

            } else {
                query.setParameter(parameter.getKey(), value);
            }
        }
    }

    private String toStringValue(final String value) {
        String result = (value + LIKE).replace('*', LIKE);
        result = result.replace("%%", LIKE + "").toLowerCase();
        return result;
    }

    private void addCondition(final StringBuilder strQuery, final String nameCompleted, Object value, final String condicion, final String operator) {
        String condAux = StringUtils.isEmpty(condicion) ? "" : condicion + " ";
        strQuery.append(" " + condAux + nameCompleted + " " + operator + " " + createNewParam(value));
    }

    private void addCondition(final StringBuilder strQuery, final String nameCompleted, Object value, final String condicion, final String operator, final TemporalType dateType) {
        String condAux = StringUtils.isEmpty(condicion) ? "" : condicion + " ";
        strQuery.append(" " + condAux + nameCompleted + " " + operator + " " + createNewParam(value, dateType));
    }

    // **CONDITION**FIRST**
    public void eq(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "=");
        }
    }

    public void ne(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "<>");
        }
    }

    public void gt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", ">");
        }
    }

    public void ge(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", ">=");
        }
    }

    public void lt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "<");
        }
    }

    public void le(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "<=");
        }
    }

    public void eq(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "=", dateType);
        }
    }

    public void gt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", ">", dateType);
        }
    }

    public void ge(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", ">=", dateType);
        }
    }

    public void lt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "<", dateType);
        }
    }

    public void le(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "", "<=", dateType);
        }
    }

    public void like(final StringBuilder strQuery, final String nameCompleted, final String value) {
        if (StringUtils.isNotEmpty(value)) {
            addCondition(strQuery, "lower(" + nameCompleted + ")", toStringValue(value), "", "LIKE");
        }
    }

    public void between(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append("  " + nameCompleted + Q_BETWEEN + createNewParam(valueA) + "  " + createNewParam(valueB));
        }
    }

    public void botBetween(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append("  " + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA) + "  " + createNewParam(valueB));
        }
    }

    public void between(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append("  " + nameCompleted + Q_BETWEEN + createNewParam(valueA, dateType) + "  " + createNewParam(valueB, dateType));
        }
    }

    public void notBetween(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append("  " + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA, dateType) + "  " + createNewParam(valueB, dateType));
        }
    }

    // **CONDITION**AND**
    public void andEq(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "=");
        }
    }

    public void andNe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "<>");
        }
    }

    public void andGt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, ">");
        }
    }

    public void andGe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, ">=");
        }
    }

    public void andLt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "<");
        }
    }

    public void andLe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "<=");
        }
    }

    public void andEq(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "=", dateType);
        }
    }

    public void andGt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, ">", dateType);
        }
    }

    public void andGe(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, ">=", dateType);
        }
    }

    public void andLt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "<", dateType);
        }
    }

    public void andLe(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "<=", dateType);
        }
    }

    public void andLike(final StringBuilder strQuery, final String nameCompleted, final String value) {
        if (StringUtils.isNotEmpty(value)) {
            addCondition(strQuery, "lower(" + nameCompleted + ")", toStringValue(value), Q_AND, "LIKE");
        }
    }

    public void andBetween(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__AND_ + nameCompleted + Q_BETWEEN + createNewParam(valueA) + Q__AND_ + createNewParam(valueB));
        }
    }

    public void andNotBetween(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__AND_ + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA) + Q__AND_ + createNewParam(valueB));
        }
    }

    public void andBetween(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__AND_ + nameCompleted + Q_BETWEEN + createNewParam(valueA, dateType) + Q__AND_ + createNewParam(valueB, dateType));
        }
    }

    public void andNotBetween(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__AND_ + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA, dateType) + Q__AND_ + createNewParam(valueB, dateType));
        }
    }

    // **CONDITION**OR**
    public void orEq(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "=");
        }
    }

    public void orNe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "<>");
        }
    }

    public void orGt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", ">");
        }
    }

    public void orGe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", ">=");
        }
    }

    public void orLt(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "<");
        }
    }

    public void orLe(final StringBuilder strQuery, final String nameCompleted, final Object value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "<=");
        }
    }

    public void orEq(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "=", dateType);
        }
    }

    public void orGt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", ">", dateType);
        }
    }

    public void orGe(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", ">=", dateType);
        }
    }

    public void orLt(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "<", dateType);
        }
    }

    public void orLe(final StringBuilder strQuery, final String nameCompleted, Date value, final TemporalType dateType) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, "OR", "<=", dateType);
        }
    }

    public void orLike(final StringBuilder strQuery, final String nameCompleted, final String value) {
        if (StringUtils.isNotEmpty(value)) {
            addCondition(strQuery, "lower(" + nameCompleted + ")", toStringValue(value), "OR", "LIKE");
        }
    }

    public void andIn(final StringBuilder strQuery, final String nameCompleted, final Collection<?> value) {
        if (value != null) {
            addCondition(strQuery, nameCompleted, value, Q_AND, "IN");
        }
    }

    public void orBetween(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__OR_ + nameCompleted + Q_BETWEEN + createNewParam(valueA) + Q__AND_ + createNewParam(valueB));
        }
    }

    public void orNotBetween(final StringBuilder strQuery, final String nameCompleted, final Object valueA, final Object valueB) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__OR_ + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA) + Q__AND_ + createNewParam(valueB));
        }
    }

    public void orBetween(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__OR_ + nameCompleted + Q_BETWEEN + createNewParam(valueA, dateType) + Q__AND_ + createNewParam(valueB, dateType));
        }
    }

    public void orNotBetween(final StringBuilder strQuery, final String nameCompleted, final Date valueA, final Date valueB, final TemporalType dateType) {
        if (valueA != null && valueB != null) {
            strQuery.append(Q__OR_ + nameCompleted + Q_NOT_BETWEEN + createNewParam(valueA, dateType) + Q__AND_ + createNewParam(valueB, dateType));
        }
    }

    // -------------
}
