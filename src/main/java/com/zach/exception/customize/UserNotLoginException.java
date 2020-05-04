package com.zach.exception.customize;

/**
 * @desc 用户未登录异常
 */
public class UserNotLoginException extends BusinessException {

    public UserNotLoginException() {
        super();
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }

    public UserNotLoginException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
