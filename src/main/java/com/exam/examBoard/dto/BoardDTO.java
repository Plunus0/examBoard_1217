package com.exam.examBoard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
public class BoardDTO {
    private String boardId;
    private String title;
    private String contents;
    private String author;
    private Date regDate;
    private Date updateDate;

    public BoardDTO(String boardId, String title, String contents, String author) {
        setBoardId(boardId);
        setTitle(title);
        setContents(contents);
        setAuthor(author);

    }
}
