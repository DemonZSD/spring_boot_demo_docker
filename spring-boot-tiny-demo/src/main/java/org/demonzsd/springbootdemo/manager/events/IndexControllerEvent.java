package org.demonzsd.springbootdemo.manager.events;

import lombok.Getter;
import lombok.Setter;
import org.demonzsd.springbootdemo.manager.events.entity.EventSource;
import org.springframework.context.ApplicationEvent;

/**
 * IndexControllerEvent is an event
 * when request for IndexController index route then trigger this events
 * @author weshzhu
 */
@Setter
@Getter
public class IndexControllerEvent extends ApplicationEvent {

    public IndexControllerEvent(EventSource source) {
        super(source);
    }
}
