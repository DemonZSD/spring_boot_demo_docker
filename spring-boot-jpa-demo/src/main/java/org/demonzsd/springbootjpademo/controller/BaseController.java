package org.demonzsd.springbootjpademo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * BaseController provides the common operation
 * @author by DemonZSD
 */
public class BaseController {

    protected Gson gson;

    public BaseController() {
        this.gson = new Gson();
    }
}
