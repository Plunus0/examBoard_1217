package com.exam.examBoard.repository;

import com.exam.examBoard.dto.BoardDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {
    public static ArrayList<BoardDTO> boards;

    static {
        boards = new ArrayList<>();
        boards.add(new BoardDTO("001", "title1","contents1", "user1"));
        boards.add(new BoardDTO("002", "title2","contents2", "user2"));
        boards.add(new BoardDTO("003", "title3","contents3", "user3"));
        boards.add(new BoardDTO("004", "title4","contents4", "user4"));
    }

    public BoardDTO  insertBoard(BoardDTO board){
        boards.add(board);
        return board;

    }

    public List<BoardDTO> getAllBoards(){
        return boards;
    }

    public BoardDTO getBoardByBoardId(String boardId){
        return boards.stream()
                .filter(boardDTO -> boardDTO.getBoardId().equals(boardId))
                .findAny()
                .orElse(new BoardDTO("","","",""));
    }

    public void updateBoard(String boardId, BoardDTO board){
        boards.stream()
                .filter(boardDTO -> boardDTO.getBoardId().equals(boardId))
                .findAny()
                .orElse(new BoardDTO("","","",""))
                .setContents(board.getContents());
    }

    public void deleteBoard(String boardId){
        boards.removeIf(BoardDTO -> BoardDTO.getBoardId().equals(boardId));
    }
}
