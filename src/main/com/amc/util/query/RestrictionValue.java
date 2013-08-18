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

import javax.persistence.TemporalType;

/**
 * @author Alvaro Cardozo
 */
public class RestrictionValue {

    private final Object value;

    private final TemporalType dateType;

    public RestrictionValue(Object value) {
        this.value = value;
        dateType = null;
    }

    public RestrictionValue(Object value, TemporalType dateType) {

        this.value = value;
        this.dateType = dateType;
    }

    public Object getValue() {
        return value;
    }

    public TemporalType getDateType() {
        return dateType;
    }

}
