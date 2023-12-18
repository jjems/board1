package com.study.board1.controller;

import com.study.board1.entity.Board;
import com.study.board1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWritefForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public void boardWritePro(Board board) {
        boardService.write(board);

//        return "";
    }
}
