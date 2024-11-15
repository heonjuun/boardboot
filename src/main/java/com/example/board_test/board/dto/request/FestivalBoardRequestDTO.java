package com.example.board_test.board.dto.request;


import com.example.board_test.board.entity.FestivalBoardEntity;
import com.example.board_test.domain.member.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FestivalBoardRequestDTO {
    private Long f_id;
    private String title;
    private String image;
    private String content;
    private int like;
    private int view;
    private int category;
    private MemberEntity member;

    public FestivalBoardEntity toEntity()
    {
        FestivalBoardEntity festivals=
                FestivalBoardEntity.builder().
                        f_id(f_id).
                        title(title).
                        image(image).
                        like(0).
                        view(0).
                        category(category).
                        member(member).
                        build();
        return festivals;

    }



}
