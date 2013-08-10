package com.amc.ebg.business.flyer;




import ch.swissbytes.commons.persistence.Persister;

/**
 * @author Timoteo Ponce
 */
public class FlyerPersister {

    private final Persister persister;

    public FlyerPersister(final Persister persister) {
        this.persister = persister;
    }

//    public void saveAsReadyToPublish(final Flyer flyer, final FlyerImage tempFlyerImage) {
//        flyer.setImageUrl("  ");
//        flyer.setFlyerStatus(FlyerStatusEnum.DRAFT.getEntity(persister));
//        persister.persist(flyer);
//        Account account = flyer.getUsers().getAccount();
//        FlyerImage flyerImage = new FlyerImageHandler().persist(account, flyer, tempFlyerImage);
//        flyer.setImageUrl(flyerImage.getLocalPath());
//        flyer.setFlyerStatus(FlyerStatusEnum.READY_TO_PUBLISH.getEntity(persister));
//        persister.persist(flyer);
//    }

//  S
}
