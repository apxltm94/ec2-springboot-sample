package me.sample.core.service;

import java.util.List;
import me.sample.core.domain.Board;

public interface BoardService {

    List<Board> getBoards(int page, int size);

}
