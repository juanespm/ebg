package com.amc.ebg.properties;

import ch.swissbytes.commons.io.ResourceLocator;

import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Timoteo Ponce
 */
public class PropertiesConfiguration implements Configuration {

    /**
     * 
     */
    private static final long serialVersionUID = 2883081224932416522L;

    public static final String NAME = "propertiesConfiguration";

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesConfiguration.class);

    private final SortedMap<String, String> properties = new TreeMap<String, String>();

    private String configurationFile;

    /**
     * 
     */
    public PropertiesConfiguration() {
    }

    public void create() {
        properties.clear();
        final Properties loadedProperties = PropertiesConfiguration.loadProperties(configurationFile);
        for (final Entry<Object, Object> entry : loadedProperties.entrySet()) {
            properties.put(entry.getKey().toString(), ObjectUtils.toString(entry.getValue()));
        }
    }

    public String getConfigurationFile() {
        return configurationFile;
    }

    public void setConfigurationFile(final String configurationFile) {
        this.configurationFile = configurationFile;
    }

    /**
     * @param resource
     * @return
     * @author Timoteo Ponce
     */
    public static Properties loadProperties(final String resource) {
        final Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            LOG.info("Reading configuration properties [ " + resource + " ] ");
            inputStream = ResourceLocator.getResourceAsStream(resource);
            properties.load(inputStream);
        } catch (final Exception e) {
            LOG.error("Resource [ " + resource + " ] can't be loaded ", e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return properties;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.accarda.erechnung.util.properties.Configuration#getString(com.accarda.
     * erechnung.util.properties.ConfigurationKey
     * )
     * @author Timoteo Ponce
     */
    @Override
    public String getString(final ConfigurationKey key) {
        return properties.get(key.getKey());
    }

    /*
     * (non-Javadoc)
     * @see
     * com.accarda.erechnung.util.properties.Configuration#getInt(com.accarda.
     * erechnung.util.properties.ConfigurationKey
     * )
     * @author Timoteo Ponce
     */
    @Override
    public Integer getInt(final ConfigurationKey key) {
        return Integer.parseInt(getString(key));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.accarda.erechnung.util.properties.Configuration#getBoolean(com.accarda
     * .erechnung.util.properties.ConfigurationKey
     * )
     * @author Timoteo Ponce
     */
    @Override
    public boolean getBoolean(final ConfigurationKey key) {
        return Boolean.valueOf(getString(key));
    }

    /*
     * (non-Javadoc)
     * @see
     * com.accarda.erechnung.util.properties.Configuration#getArray(com.accarda.
     * erechnung.util.properties.ConfigurationKey
     * )
     * @author Timoteo Ponce
     */
    @Override
    public String[] getArray(final ConfigurationKey key) {
        final String value = getString(key);
        return (value == null ? new String[] {} : value.split(","));
    }

    @Override
    public void setProperty(final ConfigurationKey configurationKey, final String value) {
        properties.put(configurationKey.getKey(), value);
    }

    @Override
    public void setProperty(final String configurationKey, final String value) {
        properties.put(configurationKey, value);
    }

    public void clear() {
        properties.clear();
    }

    @Override
    public void remove(final String configurationKey) {
        properties.remove(configurationKey);
        LOG.info("Property removed : " + configurationKey);
    }

    public int size() {
        return properties.size();
    }

    @Override
    public String getProperty(final String key) {
        return properties.get(key);
    }

}
