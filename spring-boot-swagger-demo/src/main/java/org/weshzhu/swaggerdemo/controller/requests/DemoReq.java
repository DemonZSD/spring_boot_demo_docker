package org.weshzhu.swaggerdemo.controller.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zsd
 */
@ApiModel("用户实体")
public class DemoReq implements Serializable {
    @ApiModelProperty("Demo id")
    private int id;
    @ApiModelProperty("Demo name")
    private String name;
    @ApiModelProperty("Demo address")
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
