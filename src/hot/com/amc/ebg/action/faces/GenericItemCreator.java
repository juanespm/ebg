package com.amc.ebg.action.faces;

import javax.faces.model.SelectItem;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * Generic {@link SelectItem} creator class, it should be used 
 * for all elements with these main properties:
 * <pre>
 * - id
 * - name
 * </pre>
 * @author Timoteo Ponce
 */
public class GenericItemCreator implements SelectItemCreator<Object> {

	@Override
	public SelectItem create(final Object item) {
		try {
			return new SelectItem(PropertyUtils.getProperty(item, "id"),
					PropertyUtils.getProperty(item, "name").toString());
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid item: " + e);
		}
	}

}
