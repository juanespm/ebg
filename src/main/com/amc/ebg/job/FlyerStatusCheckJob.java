package com.amc.ebg.job;

import ch.swissbytes.commons.persistence.Persister;

import java.util.List;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Transactional;
import org.jboss.seam.annotations.async.Asynchronous;
import org.jboss.seam.annotations.async.IntervalCron;
import org.jboss.seam.async.QuartzTriggerHandle;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * @author Timoteo Ponce
 */
@AutoCreate
@Name(FlyerStatusCheckJob.NAME)
public class FlyerStatusCheckJob {

    public static final String NAME = "flyerStatusCheckJob";

    private static final Logger LOG = LoggerFactory.getLogger(FlyerStatusCheckJob.class);

    @In(create = true, value = com.amc.ebg.dao.EntityPersister.NAME)
    private Persister persister;

    public FlyerStatusCheckJob() {
    }

    public FlyerStatusCheckJob(final Persister persister) {
        this.persister = persister;
    }

    @Asynchronous
    @Transactional
    public QuartzTriggerHandle execute(@IntervalCron final String cronExpression) {
//        FlyerList flyerList = new FlyerList(persister);
//        checkReadyToPublish(flyerList);
//        checkExpired(flyerList);
        return null;
    }

//    private void checkExpired(final FlyerList flyerList) {
//        List<Flyer> published = flyerList.withStatus(FlyerStatusEnum.PUBLISHED).list();
//        long count = 0;
//        for (Flyer flyer : published) {
//            count += expireFlyer(flyer) ? 1 : 0;
//        }
//        if (count > 0) {
//            LOG.info("[" + count + "] flyers set to EXPIRED");
//        }
//    }
//
//    private void checkReadyToPublish(final FlyerList flyerList) {
//        List<Flyer> readyToPublish = flyerList.withStatus(FlyerStatusEnum.READY_TO_PUBLISH).list();
//        long count = 0;
//        for (Flyer flyer : readyToPublish) {
//            count += publishFlyer(flyer) ? 1 : 0;
//        }
//        if (count > 0) {
//            LOG.info("[ " + count + " ] flyers set to PUBLISHED");
//        }
//    }
//
//    private boolean expireFlyer(final Flyer flyer) {
//        DateTime now = new DateTime();
//        boolean updated = false;
//        if (now.isAfter(new DateTime(flyer.getExpirationDate()))) {
//            flyer.setFlyerStatus(FlyerStatusEnum.EXPIRED.getEntity(persister));
//            persister.update(flyer);
//            updated = true;
//            LOG.info("Flyer EXPIRED[ " + flyer.getId() + " ]");
//        }
//        return updated;
//    }
//
//    private boolean publishFlyer(final Flyer flyer) {
//        Interval interval = new Interval(new DateTime(flyer.getPublicationDate()), new DateTime(flyer.getExpirationDate()));
//        boolean updated = false;
//        if (interval.contains(new DateTime())) {
//            flyer.setFlyerStatus(FlyerStatusEnum.PUBLISHED.getEntity(persister));
//            persister.update(flyer);
//            updated = true;
//            updateCategories(flyer);
//            LOG.info("Flyer PUBLISHED[ " + flyer.getId() + " ]");
//        }
//        return updated;
//    }
//
//    private void updateCategories(final Flyer flyer) {
//        Category category = flyer.getCategory();
//        while (category != null) {
//            category.setLastPublishedFlyer(flyer.getPublicationDate());
//            persister.persist(category);
//            category = category.getParent();
//        }
//    }

}
