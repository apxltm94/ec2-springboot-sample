package me.sample.myapp.api.board.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum BoardErrorCode {

    NOT_FOUND(HttpStatus.NOT_FOUND, "게시판이 존재하지 않습니다.");

    private final HttpStatus status;
    private final String message;

}
