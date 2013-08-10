package com.amc.ebg.properties;

/**
 * @author Timoteo Ponce
 */
public interface Configuration {

    String NAME = "applicationConfiguration";

    String getString(final ConfigurationKey key);

    Integer getInt(final ConfigurationKey key);

    boolean getBoolean(final ConfigurationKey key);

    /**
     * Returns a comma separated property values as an array.
     * 
     * @param key
     * @return
     */
    String[] getArray(final ConfigurationKey key);

    String getProperty(String key);

    void setProperty(final ConfigurationKey configurationKey, final String value);

    void setProperty(final String configurationKey, final String value);

    void remove(String configurationKey);

}
