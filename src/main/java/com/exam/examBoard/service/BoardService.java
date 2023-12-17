package com.exam.examBoard.service;

import com.exam.examBoard.dto.BoardDTO;
import com.exam.examBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
     @Autowired
     BoardRepository boardRepository;

     public BoardDTO insertBoard(BoardDTO board){
         return boardRepository.insertBoard(board);
     }

     public List<BoardDTO> getAllBoards(){
         return boardRepository.getAllBoards();
     }

     public BoardDTO getBoardByBoardId(String boardId){
         return boardRepository.getBoardByBoardId(boardId);
     }

     public void updateBoard(String boardId, BoardDTO board){
         boardRepository.updateBoard(boardId, board);
     }

     public void deleteBoard(String boardId){
         boardRepository.deleteBoard(boardId);
     }
}
