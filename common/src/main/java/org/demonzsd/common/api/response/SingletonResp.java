package org.demonzsd.common.api.response;

import lombok.Getter;
import lombok.Setter;
import org.demonzsd.common.api.RespCode;
import org.demonzsd.common.api.RespMsg;

/**
 * SingletonResp construct an instance with singleton T object
 *
 * @author by DemonZSD
 */
@Getter
public class SingletonResp<T> extends BaseResp{
    private @Setter T data;

    public static SingletonResp builder(){
        return new SingletonResp(new BaseResp(RespCode.SUCCESS_CODE, RespMsg.RESP_OK));
    }

    public SingletonResp(String code, String msg) {
        super(code, msg);
    }

    public SingletonResp(BaseResp baseResp) {
        super(baseResp);
    }

    public SingletonResp<T> success(String msg, T data){
        SingletonResp<T> resp = new SingletonResp<>(new BaseResp(RespCode.SUCCESS_CODE, msg));
        if(data != null){
            resp.setData(data);
        }
        return resp;
    }

    public SingletonResp failed(String code, String msg){
        return new SingletonResp(code, msg);
    }

}
