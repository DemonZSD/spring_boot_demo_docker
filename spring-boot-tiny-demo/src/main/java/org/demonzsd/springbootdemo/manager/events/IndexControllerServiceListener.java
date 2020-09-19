package org.demonzsd.springbootdemo.manager.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 监听器，用于监听 {@code IndexControllerEvent} 事件
 * @author weshzhu
 */
@Service
public class IndexControllerServiceListener implements ApplicationListener<IndexControllerEvent> {
    @Override
    public void onApplicationEvent(IndexControllerEvent event) {
        // TODO  监听事件发生后，要做的事情

        System.out.println("the event happened!");

    }
}
