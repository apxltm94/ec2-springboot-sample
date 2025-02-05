package me.sample.myapp.core.common.exception;


public abstract class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;

    protected BusinessException(final ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

}
