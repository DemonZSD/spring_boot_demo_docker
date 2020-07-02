package org.demonzsd.common.api.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.demonzsd.common.api.RespCode;
import org.demonzsd.common.api.RespMsg;

/**
 * BaseResp is the response for RESTFul api
 *
 * @author by DemonZSD
 */
@ToString
@Getter
@Setter
public class BaseResp{
    private String code;
    private String msg;

    public BaseResp(BaseResp baseResp) {
        this.code = baseResp.code;
        this.msg = baseResp.msg;
    }

    public BaseResp(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private boolean isSuccess(){
        return RespCode.SUCCESS_CODE.equals(this.code);
    }
}
