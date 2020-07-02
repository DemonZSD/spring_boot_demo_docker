package org.demonzsd.springbootdemo.service.impl;

import org.demonzsd.springbootdemo.MiddleProperties;
import org.demonzsd.springbootdemo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IndexServiceImpl extends BaseServiceImpl implements IndexService {
    @Autowired
    private MiddleProperties middleProperties;
    @Override
    public void show() {

        System.out.println(middleProperties.getServer());
        System.out.println(middleProperties.getEtcd().getHost());
        logger.debug("this is debug msg");
        logger.info("this is info msg");
        logger.error("this is error msg");
    }
}
