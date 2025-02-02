package me.sample.core.api.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.sample.core.api.service.BoardService;
import me.sample.core.domain.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boards")
    public List<Board> getBoards(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "10") int size
    ) {
        return boardService.getBoards(page, size);
    }

}
