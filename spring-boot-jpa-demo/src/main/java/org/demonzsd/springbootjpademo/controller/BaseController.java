package org.demonzsd.springbootjpademo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BaseController provides the common operation
 * @author by DemonZSD
 */
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(BaseController.class);
    protected Gson gson;

    public BaseController() {
        this.gson = new Gson();
    }
}
