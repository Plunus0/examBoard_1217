package com.exam.examBoard.controller;

import com.exam.examBoard.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exam.examBoard.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("/bbs")
public class BoardContoller {
    @Autowired
    BoardService boardService;

    @PostMapping("")
    public BoardDTO insertBoard(@RequestBody BoardDTO board){
        return boardService.insertBoard(board);
    }

    @GetMapping("")
    public List<BoardDTO> getAllBoards(){
        return boardService.getAllBoards();
    }

    @GetMapping("/{boardId}")
    public BoardDTO getBoardByBoardId(@PathVariable String boardId){
        return boardService.getBoardByBoardId(boardId);
    }

    @PutMapping("/{boardId}")
    public void updateBoard(@PathVariable String boardId, @RequestBody BoardDTO board){
        boardService.updateBoard(boardId, board);
    }

    @DeleteMapping("/{boardId}")
    public void deleteBoard(@PathVariable String boardId){
        boardService.deleteBoard(boardId);
    }
}
