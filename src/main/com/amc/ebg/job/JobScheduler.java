package com.amc.ebg.job;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.annotations.Scope;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amc.ebg.properties.Configuration;
import com.amc.ebg.properties.ConfigurationKey;

/**
 * @author Timoteo Ponce
 */
@Name(JobScheduler.NAME)
@Scope(ScopeType.APPLICATION)
@AutoCreate
public class JobScheduler {
    public static final String NAME = "jobScheduler";

    private static final Logger LOG = LoggerFactory.getLogger(JobScheduler.class);

    @In
    private Configuration applicationConfiguration;

    @In
    private FlyerStatusCheckJob flyerStatusCheckJob;

    /**
     * @author Timoteo Ponce
     * @throws SchedulerException
     * @throws BatchException
     */
    @Observer("org.jboss.seam.postInitialization")
    public void schedule() throws SchedulerException {
        if (applicationConfiguration.getBoolean(ConfigurationKey.CHECKFLYERSTATUS_ENABLED)) {
            String cron = applicationConfiguration.getString(ConfigurationKey.CRONJOB_CHECKFLYERSTATUS);
            flyerStatusCheckJob.execute(cron);
            LOG.info("FlyerCheckStatus job scheduled : " + cron);
        } else {
            LOG.info("FlyerCheckStatus job is disabled ");
        }
    }

}
