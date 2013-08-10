package com.amc.ebg.domain.dto;


import org.apache.commons.lang.StringUtils;



/**
 * @author Timoteo Ponce
 */
public class CategoryId {

    public static final CategoryId NULL = new CategoryId(-1);

    private final Integer value;

    private CategoryId(final Integer value) {
        this.value = value;
    }

    public Integer intValue() {
        return value;
    }

    public Long longValue() {
        return value.longValue();
    }

    public static CategoryId of(final Number value) {
        return new CategoryId(value.intValue());
    }

    public static CategoryId of(final String rawCategory) {
        if (StringUtils.isNumeric(rawCategory)) {
            return of(Integer.parseInt(rawCategory));
        }
        return NULL;
    }

//    public Category toCategory() {
//        Category category = null;
//        if (this != CategoryId.NULL) {
//            category = new Category();
//            category.setId(longValue());
//        }
//        return category;
//    }

}
