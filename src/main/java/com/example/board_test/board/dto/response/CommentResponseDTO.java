package com.example.board_test.board.dto.response;


import com.example.board_test.board.entity.CommentEntity;
import lombok.Getter;

@Getter
public class CommentResponseDTO {
    private final Long comment_id;
    private final String image;
    private final String commentText;
    private final String siren;
    private final String createdDate,modifiedDate;
    private final String nickname;
    private final Long board_id;

    public CommentResponseDTO(CommentEntity comment)
    {
        this.comment_id=comment.getComment_id();
        this.image=comment.getImage();
        this.commentText=comment.getCommentText();
        this.siren=comment.getSiren();
        this.nickname=comment.getMember().getNick();
        this.board_id=comment.getBoard().getN_id();
        this.createdDate=comment.getCreatedDate();
        this.modifiedDate=comment.getModifiedDate();
    }


}
