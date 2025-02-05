package me.sample.myapp.api.board;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.sample.myapp.api.board.response.BoardsResponse;
import me.sample.myapp.core.service.board.BoardService;
import me.sample.myapp.core.domain.board.model.Board;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boards")
    public ResponseEntity<BoardsResponse> getBoards(@RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "10") int size) {
        List<Board> boards = boardService.getBoards(page, size);
        return ResponseEntity.ok(BoardsResponse.of(boards));
    }

}
