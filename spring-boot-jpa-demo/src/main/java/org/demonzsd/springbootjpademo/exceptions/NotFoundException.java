package org.demonzsd.springbootjpademo.exceptions;

import org.demonzsd.springbootjpademo.common.CustomConst;


/**
 * NotFoundException catch the not found or empty exception
 *
 * @author by DemonZSD
 */
public class NotFoundException extends SpringbootJpaDemoException {

    public NotFoundException(){
        this(CustomConst.CAN_NOT_FOUND_MSG);
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
