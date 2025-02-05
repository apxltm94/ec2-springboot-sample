package me.sample.myapp.core.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not found"),
    BOARD_NOT_FOUND(HttpStatus.NOT_FOUND, "Board not found");

    private final HttpStatus status;
    private final String message;

}
