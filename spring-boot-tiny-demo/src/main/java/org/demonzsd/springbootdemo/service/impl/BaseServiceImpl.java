package org.demonzsd.springbootdemo.service.impl;

import org.demonzsd.springbootdemo.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);
}
