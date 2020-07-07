package org.demonzsd.common.api.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
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

    /**
     * success return the default response
     * @author DemonZSD
     * @param msg is custom message put in BaseResp response.
     * @return {@code org.demonzsd.common.api.response.BaseResp}
     */
    public static BaseResp success(String msg){
        return new BaseResp(RespCode.SUCCESS_CODE, StringUtils.isNotEmpty(msg) ? msg : RespMsg.RESP_OK);
    }

    public static BaseResp failed(String code, String msg){
        return new BaseResp(StringUtils.isNotEmpty(code) ? code : RespCode.SYSTEM_ERR_CODE,
                StringUtils.isNotEmpty(msg) ? msg : RespMsg.RESP_FAILED);
    }
}
