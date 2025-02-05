package me.sample.myapp.api.board.response;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import me.sample.myapp.core.domain.board.model.Board;

public class BoardsResponse {

    private final List<Board> boards;

    @Builder
    private BoardsResponse(List<Board> boards) {
        this.boards = new ArrayList<>(boards);
    }

    public static BoardsResponse of(List<Board> boards) {
        return BoardsResponse.builder()
            .boards(boards)
            .build();
    }

}
