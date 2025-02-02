package me.sample.core.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.sample.core.domain.Board;
import me.sample.core.service.BoardService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    public List<Board> getBoards(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return boardService.getBoards(page, size);
    }

}
