package org.demonzsd.springbootdemo.manager.events;

import org.springframework.context.ApplicationEvent;

/**
 * IndexControllerEvent is an event
 * when request for IndexController index route then trigger this events
 * @author weshzhu
 */
public class IndexControllerEvent extends ApplicationEvent {

    public IndexControllerEvent(Object source) {
        super(source);
    }
}
