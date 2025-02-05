package me.sample.myapp.core.domain.board.exception;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public class BoardNotFoundException extends NotFoundException {

    public BoardNotFoundException() {
        super();
    }
}
