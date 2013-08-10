package com.amc.ebg.properties;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Install;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

/**
 * @author Timoteo Ponce
 */
@Scope(ScopeType.STATELESS)
@BypassInterceptors
@Name("configurationFactory")
@Install(precedence = 0)
public class ConfigurationFactory {

    /**
     * @return
     * @author Timoteo Ponce
     */
    @Factory(value = Configuration.NAME, autoCreate = true, scope = ScopeType.APPLICATION)
    public Configuration getApplicationConfiguration() {
        final PropertiesConfiguration baseConfig = new PropertiesConfiguration();
        baseConfig.setConfigurationFile("application.properties");
        baseConfig.create();
        return baseConfig;
    }
}

