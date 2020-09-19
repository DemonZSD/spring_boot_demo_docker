package org.demonzsd.springbootdemo.service.impl;

import org.demonzsd.springbootdemo.MiddleProperties;
import org.demonzsd.springbootdemo.manager.events.IndexControllerEvent;
import org.demonzsd.springbootdemo.manager.events.entity.EventSource;
import org.demonzsd.springbootdemo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


/**
 *
 * @author weshzhu
 */
@Service
public class IndexServiceImpl extends BaseServiceImpl implements IndexService, ApplicationEventPublisherAware {
    @Autowired
    private MiddleProperties middleProperties;

    private ApplicationEventPublisher applicationEventPublisher;
    /**
     * 该方法会触发事件发生
     */
    @Override
    public void show() {

        System.out.println(middleProperties.getServer());
        System.out.println(middleProperties.getEtcd().getHost());
        logger.debug("this is debug msg");
        logger.info("this is info msg");
        logger.error("this is error msg");
        EventSource source = new EventSource();
        applicationEventPublisher.publishEvent(new IndexControllerEvent(source));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
