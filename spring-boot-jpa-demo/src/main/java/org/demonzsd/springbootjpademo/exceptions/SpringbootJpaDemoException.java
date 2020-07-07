package org.demonzsd.springbootjpademo.exceptions;

/**
 * SpringbootJpaDemoException define custom exception
 *
 * @author by DemonZSD
 */
public class SpringbootJpaDemoException extends Exception {
    public SpringbootJpaDemoException(String msg){
        super(msg);
    }

    public SpringbootJpaDemoException(String msg, Throwable cause){
        super(msg, cause);
    }
    public SpringbootJpaDemoException(Throwable cause){
        super(cause);
    }

}
