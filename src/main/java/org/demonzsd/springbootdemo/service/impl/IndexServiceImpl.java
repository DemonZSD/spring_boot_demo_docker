package org.demonzsd.springbootdemo.service.impl;

import org.demonzsd.springbootdemo.service.IndexService;
import org.springframework.stereotype.Service;


@Service
public class IndexServiceImpl extends BaseServiceImpl implements IndexService {

    @Override
    public void show() {
        logger.debug("this is debug msg");
        logger.info("this is info msg");
        logger.error("this is error msg");
    }
}
