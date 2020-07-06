package org.demonzsd.springbootjpademo.exceptions;

import org.aspectj.weaver.ast.Not;
import org.demonzsd.common.api.RespMsg;

/**
 * NotFoundException catch the not found or empty exception
 *
 * @author by DemonZSD
 */
public class NotFoundException extends ServiceException{

    public NotFoundException(){
        this(RespMsg.NOT_FOUND);
    }

    public NotFoundException(String msg) {
        super(msg);
    }

    public NotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
