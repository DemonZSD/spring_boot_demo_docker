package org.demonzsd.springbootjpademo.exceptions;

/**
 * ServiceException define custom exception
 *
 * @author by DemonZSD
 */
public class ServiceException extends Exception {
    public ServiceException(String msg){
        super(msg);
    }

    public ServiceException(String msg, Throwable cause){
        super(msg, cause);
    }
    public ServiceException(Throwable cause){
        super(cause);
    }

}
