package com.amc.ebg.ws;

import ch.swissbytes.commons.persistence.ComponentsFactory;
import ch.swissbytes.commons.persistence.Persister;

import javax.persistence.EntityManager;

import com.amc.ebg.dao.EntityPersister;
//import com.amc.ebg.dao.FlyerActionLogger;
//import com.amc.ebg.ws.operations.GetCategoryListAction;
//import com.amc.ebg.ws.operations.GetFlyerListAction;
//import com.amc.ebg.ws.operations.GetIdAction;
//import com.amc.ebg.ws.operations.MarkFavoriteAction;
//import com.amc.ebg.ws.operations.RemoveFavoriteAction;
//import com.amc.ebg.ws.operations.SubscribeCategoryAction;
//import com.amc.ebg.ws.operations.UnsubscribeCategoryAction;

/**
 * @author Timoteo Ponce
 */

public class ActionsFactory {

    private final Persister persister=null;

    private ComponentsFactory factory;

//  private final FlyerActionLogger logger;

    private ComponentsFactory getFactory() {
        if (factory == null) {
            factory = new ComponentsFactory();
        }
        return factory;
    }

//    public ActionsFactory(final EntityManager entityManager, final boolean loggingEnabled) {
//        this.persister = new EntityPersister(entityManager);
//        this.logger = (loggingEnabled ? new FlyerActionLogger(persister) : FlyerActionLogger.NULL);
//    }
//
//    public ActionsFactory(final boolean loggingEnabled) {
//        this.persister = getFactory().getInstance(EntityPersister.NAME, true);
//        this.logger = (loggingEnabled ? new FlyerActionLogger(persister) : FlyerActionLogger.NULL);
//    }
//
//    public GetIdAction idAction() {
//        return new GetIdAction(persister);
//    }
//
//    public GetCategoryListAction categoryListAction() {
//        return new GetCategoryListAction(persister);
//    }
//
//    public SubscribeCategoryAction subscribeCategoryAction() {
//        return new SubscribeCategoryAction(persister, logger);
//    }
//
//    public UnsubscribeCategoryAction unsubscribeCategoryAction() {
//        return new UnsubscribeCategoryAction(persister, logger);
//    }
//
//    public GetFlyerListAction flyerListAction() {
//        return new GetFlyerListAction(persister);
//    }
//
//    public MarkFavoriteAction markAsFavoriteAction() {
//        return new MarkFavoriteAction(persister, logger);
//    }
//
//    public RemoveFavoriteAction removeFromFavoriteAction() {
//        return new RemoveFavoriteAction(persister, logger);
//    }
//
//    public FlyerActionLogger actionLogger() {
//        return new FlyerActionLogger(persister);
//    }

}
