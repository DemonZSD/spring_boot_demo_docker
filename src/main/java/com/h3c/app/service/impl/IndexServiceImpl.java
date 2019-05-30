package com.h3c.app.service.impl;

import com.h3c.app.service.IndexService;
import org.springframework.stereotype.Service;


@Service
public class IndexServiceImpl extends BaseServiceImpl implements IndexService {

    @Override
    public void show() {
        for (int i=0; i<1000; i++) {
            logger.debug("this is debug msg");
            logger.info("this is info msg");
            logger.error("this is error msg");
        }
    }
}
